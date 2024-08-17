plugins {
    id("java")
}

group = "com.example.cucumbertests"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation ("io.cucumber:cucumber-java:7.14.1")
    testImplementation ("io.cucumber:cucumber-junit-platform-engine:7.14.1")
    testImplementation ("org.junit.platform:junit-platform-suite-api:1.10.3")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}