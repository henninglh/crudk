# Crudk - a simple webserver 

## What is the plan?
Creating a CRUD component in Kotlin that can work as a starting building block in a microservice world.

## Where to start next time
Dependency injection - framework or just create classes?

## TODOs in prioritized order
- [ ] Implement multiple routes
- [ ] Connect Ktorm to SQL database
- [x] Correlation ID on calls
- [ ] API tests (http calls/headers etc.)
- [ ] Service tests (dependency injection)
- [ ] Repository tests (DB testing! Create DB in docker container and run queries)
- [ ] Tests that uses MockK (mocking API, DI and DB)
- [x] Tests that uses JUnit5
- [ ] Add Jacoco for test coverage
- [ ] Implement keycloak authentication (or other sufficient auth standard protocol)
- [ ] Decide on dependency injection
- [x] Docker multistage build
- [x] Expose Prometheus stats
- [ ] Swagger documentation
- [ ] Find nice-to-haves and create a prioritized TODO

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

## Informational links
- [Spek how-to](https://www.baeldung.com/kotlin-spek#:~:text=Spek%20is%20a%20Kotlin%2Dbased,tests%20that%20we%20might%20have.)
