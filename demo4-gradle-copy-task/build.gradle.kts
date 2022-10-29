plugins {
    id("java")
    id("application")
}

group = "ru.sberbank.demo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jup:wqiter:junit-jupiter-engine:5.8.1")
}


tasks {
    named<Test>("test") {
        useJUnitPlatform()
    }

    named("processResources"){
        dependsOn(":copyFile" )
    }

    register<Copy>("copyFile") {
        from("${project.rootDir}/cat.txt") {
            filter {
                if (project.hasProperty("TEST")) replaceProfile(it, "TestProfile", "R")
                else {
                    replaceProfile(it, "ProdProfile", "D")
                }
            }
        }
        into("${sourceSets.main.get().output.resourcesDir}")

    }
}

application {
    mainClass.set("ru.sberbank.demo.Main")
}

fun replaceProfile(content: String, profile: String, token: String) = content.replace("&", token).replace("@NameToReplace@", profile)