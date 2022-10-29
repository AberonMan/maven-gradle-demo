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

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}


// It;s easy to break build process if in name will be assemble tas
tasks.named("processResources"){
    dependsOn(":copyFile" )
}

tasks.register<Copy>("copyFile") {
    from("${project.rootDir}/cat.txt") {
        filter {
            if (project.hasProperty("TEST")) it.replace("&", "T")
            else {
                it.replace("&", "P").replace("@NameToReplace@", "ProdProfile")
            }
        }
    }
    into("${sourceSets.main.get().output.resourcesDir}")

}


application {
    mainClass.set("ru.sberbank.demo.Main")
}