# Crudk - a simple webserver 

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