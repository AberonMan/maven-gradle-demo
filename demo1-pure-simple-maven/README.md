# Demo 1. Simple maen project

Simple gradle project setup demonstration that shows mininal setup for simple
simple java application.

1. First you should specify you jdk locations in toolchains.xml  

2. Second you should run the following command:

You can run this project by using command 
````
mvn package exec:exec -s ./settings.xml -t ./toolchain.xml
```