import nu.studer.gradle.credentials.domain.CredentialsContainer

plugins {
    id("java")
    id("application")
    id("nu.studer.credentials")
}

group = "ru.sberbank.demo"
version = "1.0-SNAPSHOT"

repositories {
    val credentials: CredentialsContainer by extra
    val mavenUsernameProperty = "mvnUsername"
    val mavenPasswordProperty = "mvnPassword"

    // obtain property from credential plugin if exists, if not get it from gradle property
    val mavenUsername: String? =
        credentials.getProperty(mavenUsernameProperty) as? String ?: project.findProperty(mavenUsernameProperty) as? String

    // obtain property from credential plugin if exists, if not get it from gradle property
    val mavenPassword: String? =
        credentials.getProperty(mavenPasswordProperty) as? String ?: project.findProperty(mavenPasswordProperty) as? String

    maven {
        url = uri(ArtifactRepositoryContainer.MAVEN_CENTRAL_URL)
        credentials {
            username = mavenUsername
            username = mavenPassword
        }
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

application {
    mainClass.set("ru.sberbank.demo.Main")
}