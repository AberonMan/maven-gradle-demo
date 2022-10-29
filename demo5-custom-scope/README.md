# Demo 5. Gradle custom scope

Gradle custom scope configuration, it demonstrate how we can exclude dependencies from war artificial and
not exclude it from direct spring boot start via gradle task ``bootRun``

Run and check that not jms api in lib folder:
```
 ./gradlew war --console=verbose
```

Run to check that boot is started in standalone mode:
```
./gradlew bootRun
```