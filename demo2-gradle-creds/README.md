# Demo 2. Gradle credentials

Simple gradle project setup demonstration how you can configure credentials for gradle plugin and dependency repositories.

Plugin repository credential is configured in:
```
gradle.properties
```

You can credential by credential plugin via command:

1. Add username property
```
./gradlew addCredentials --key mvnUsername --value <maven-username>
```
2. Add password property to credential plugin:

```
./gradlew addCredentials --key mvnPassword --value <maven-password>
```
3. Run your application
Than you can run application:
```
 ./gradlew --console=plain run
```
