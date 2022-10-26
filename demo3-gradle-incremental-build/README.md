# Demo 1. Simple gradle project

Simple gradle project setup demonstrations incremental compilation and incremental build

Run cat picture:
```
 ./gradlew --console=plain run
```

Build project:
```
 ./gradlew build --console=plain run
```
Incremental logs can be obtained with command:
``
./gradlew build --console=plain run --info | grep DemoFilesUtils
``


Run with clean:
```
 ./gradlew --console=plain clean run
```