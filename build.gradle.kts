plugins {
    id("java")
}

group = "com.windows.tiecode"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("io.github.vincenzopalazzo:material-ui-swing:1.1.2")
}

tasks.test {
    useJUnitPlatform()
}