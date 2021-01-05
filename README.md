# Crudk - a simple webserver 

## What is the plan?
Creating a CRUD component in Kotlin that can work as a starting building block in a microservice world.

## TODOs
[ ] Implement multiple routes
[ ] Implement keycloak authentication
[ ] Tests that uses MockK
[ ] Tests that uses Spek
[ ] API tests
[ ] Service tests
[ ] Repository tests
[ ] Expose Prometheus stats
[ ] Swagger documentation
[ ] Gradle builds docker image
[ ] Connect Ktorm to SQL database
[ ] Find nice-to-haves and create a prioritized TODO

## Ktor
Ktor is the web application framework used. It runs a Netty server,
but it should be easy to configure it to run Jetty/Tomcat/CIO instead.

### Authentication
Crudk uses OIDC/Auth2.0 in order to be able to work with Keycloak (KC). WIP!

Code to handle other authentication protocols++ will be implemented, but only after the KC implementation is working.

## Ktorm
The database framework Crudk will use. WIP!

## Spek
The test framework Crudk uses. WIP!

If it fails horribly at doing its job, JUnit 5 will take over.

## MockK
The mocking library for testing Crudk uses. WIP!