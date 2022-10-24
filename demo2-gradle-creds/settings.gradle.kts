pluginManagement {
    plugins {
        id("nu.studer.credentials") version "2.1"
    }
    repositories {
        maven() {
            // you company URL here
            url = uri("https://plugins.gradle.org/m2/")
            credentials {
                val mavenUsername: String? by settings
                val mavenPassword: String? by settings

                // if you want to specify password and username for gradle plugin you should load it from gradle.properties file
                mavenUsername?.let {
                    username = mavenUsername
                }
                mavenPassword?.let {
                    password = mavenPassword
                }
            }
        }
    }
}
rootProject.name = "demo2-pure-simple-gradle"