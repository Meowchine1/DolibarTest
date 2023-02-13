plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"
val allureVersion = "2.21.0"
val junitVersion = "5.1.0"
var lombokVersion = "1.18.24"
repositories {
    mavenCentral()
}

dependencies {
    //Lombok
    compileOnly("org.projectlombok:lombok:$lombokVersion")
    annotationProcessor("org.projectlombok:lombok:$lombokVersion")

    // JUNIT5
    testImplementation("org.junit.jupiter:junit-jupiter-api:$junitVersion")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junitVersion")

    //TESTNG
    testImplementation("org.testng:testng:7.7.1")

    // Allure
    implementation("io.qameta.allure:allure-selenide:$allureVersion")
    implementation("io.qameta.allure:allure-java-commons:$allureVersion")

    //Selenide
    implementation("com.codeborne:selenide:6.11.2")

    // WebdriverManager
    implementation("io.github.bonigarcia:webdrivermanager:5.3.2")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}