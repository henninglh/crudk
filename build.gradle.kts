//import org.gradle.api.tasks.testing.logging.TestLogEvent.STARTED
//import org.gradle.api.tasks.testing.logging.TestLogEvent.FAILED
//import org.gradle.api.tasks.testing.logging.TestLogEvent.PASSED
//import org.gradle.api.tasks.testing.logging.TestLogEvent.SKIPPED
//import org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL

val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project
val mockk_version: String by project
val spek_version: String by project

plugins {
    application
    kotlin("jvm") version "1.4.21"
}

group = "no.desperados"
version = "0.0.1"

application {
    mainClassName = "io.ktor.server.netty.EngineMain"
}

repositories {
    mavenLocal()
    jcenter()
    maven { url = uri("https://kotlin.bintray.com/ktor") }
    maven { url = uri("https://kotlin.bintray.com/kotlinx") }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlin_version")
    implementation("io.ktor:ktor-server-netty:$ktor_version")
    implementation("ch.qos.logback:logback-classic:$logback_version")
    implementation("io.ktor:ktor-metrics:$ktor_version")
    implementation("io.ktor:ktor-server-core:$ktor_version")
    implementation("io.ktor:ktor-auth:$ktor_version")
    implementation("io.ktor:ktor-auth-jwt:$ktor_version")
    implementation("io.ktor:ktor-gson:$ktor_version")
    implementation("io.ktor:ktor-client-core:$ktor_version")
    implementation("io.ktor:ktor-client-core-jvm:$ktor_version")
    implementation("io.ktor:ktor-client-apache:$ktor_version")
    implementation("io.ktor:ktor-client-auth-jvm:$ktor_version")
    implementation("io.ktor:ktor-client-json-jvm:$ktor_version")
    implementation("io.ktor:ktor-client-gson:$ktor_version")
    testImplementation("io.ktor:ktor-server-tests:$ktor_version")
    testImplementation("io.ktor:ktor-client-mock:$ktor_version")
    testImplementation("io.ktor:ktor-client-mock-jvm:$ktor_version")
    testImplementation("io.mockk:mockk:$mockk_version")
    testImplementation("org.jetbrains.spek:spek-api:$spek_version")
    testImplementation("org.jetbrains.spek:spek-junit-platform-engine:$spek_version")
}

kotlin.sourceSets["main"].kotlin.srcDirs("src")
kotlin.sourceSets["test"].kotlin.srcDirs("test")

sourceSets["main"].resources.srcDirs("resources")
sourceSets["test"].resources.srcDirs("testresources")


//val test: Test by tasks.getting(Test::class) {
//    useJUnitPlatform()
//    testLogging {
//        events = setOf(STARTED, PASSED, SKIPPED, FAILED)
//        showCauses = true
//        showExceptions = true
//        showStackTraces = true
//        exceptionFormat = FULL
//    }
//    maxHeapSize = "1024m"
//    jvmArgs("-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap", "-XX:MaxPermSize=256m")
//}
//
//val sourcesJar by tasks.creating(Jar::class) {
//    archiveClassifier.set("sources")
//    from(sourceSets.getByName("main").allSource)
//}
