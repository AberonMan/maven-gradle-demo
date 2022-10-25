# Demo 3. Maven incremental compilation


Reading: https://github.com/apache/maven/blob/31eac83e2777f2b69a0fe0b14788a6766b254db6/Documentation/CACHE.md

Simple maven project demonstrate maven incremental compilation 

1. Change
```java DemoFilesUtils.loadFile``` method body without signature check

2. Second you should run the following command:

You can run this project by using command and see that modules are running
````
mvn package -s ./settings.xml -t ./toolchain.xml

````

Advanced incremental compilation can be added by ```useIncrementalCompilation``` flag, but it can fail build easily.

1. Change method name in DemoFilesUtils
2. Run build

````
mvn package -s ./settings.xml -t ./toolchain.xml

````