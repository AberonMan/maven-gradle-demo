# Demo 1. Maven antrun plugin

Simple maven project setup demonstrate, antRun plugin usage

Run command example:

````
mvn clean package exec:exec -s ./settings.xml -t ./toolchain.xml -PTest
```

```
mvn clean package exec:exec -s ./settings.xml -t ./toolchain.xml -PProd
```