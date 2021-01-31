# Build project
FROM gradle:6.8.1-jdk11-openj9 AS BUILD_STAGE

ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME

COPY build.gradle.kts gradle.properties $APP_HOME
COPY gradle $APP_HOME/gradle
COPY --chown=gradle:gradle . /home/gradle/src
USER root

RUN chown -R gradle /home/gradle/src && gradle clean build || return 0
COPY . .


# Actual container
FROM openjdk:12-jdk-alpine

ENV APPLICATION_USER ktor
ENV APP_HOME=/usr/app/
ENV ARTIFACT_NAME=crudk-0.0.1.jar
RUN adduser -D -g '' $APPLICATION_USER && mkdir /app && chown -R $APPLICATION_USER /app

USER $APPLICATION_USER

WORKDIR $APP_HOME
COPY --from=BUILD_STAGE $APP_HOME/build/libs/$ARTIFACT_NAME .

EXPOSE 8080

CMD ["java", "-jar", "crudk-0.0.1.jar"]
