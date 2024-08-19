plugins {
    id("java")
}

group = "com.example.cucumbertests"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.cucumber:cucumber-java:7.18.1")
    testImplementation("io.cucumber:cucumber-junit-platform-engine:7.18.1")

    testImplementation("org.junit.jupiter:junit-jupiter:5.11.0")
    testImplementation("org.junit.platform:junit-platform-suite-api:1.11.0")
}

tasks.test {
    useJUnitPlatform()
}