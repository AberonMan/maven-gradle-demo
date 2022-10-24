pluginManagement {
    plugins {
        id("nu.studer.credentials") version "2.1"
    }
    repositories {
        maven() {
            // you company URL here
            url = uri("https://plugins.gradle.org/m2/")
            credentials {
                val mvnUsername: String? by settings
                val mvnPassword: String? by settings

                // if you want to specify password and username for gradle plugin you should load it from gradle.properties file
                mvnUsername?.let {
                    username = mvnUsername
                }
                mvnPassword?.let {
                    password = mvnPassword
                }
            }
        }
    }
}
rootProject.name = "demo2-pure-simple-gradle"