# Demo 2. Gradle credentials

Simple gradle project setup demonstration how you can configure credentials for gradle plugin and dependency repositories.

Plugin repository credential is configured in:
```
gradle.properties
```

You can credential by credential plugin via command:
```
./gradlew addCredentials --key mvnUsername --value <maven-username>
```

```
./gradlew addCredentials --key mvnPassword --value <maven-password>
```

Than you can run application:
```
 ./gradlew --console=plain run
```
