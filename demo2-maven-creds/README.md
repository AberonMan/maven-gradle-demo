# Demo 2. Maven credentials

Maven credentials can be specified in settings xml in safe encrypted way:
1. You generate master key and save it to settings_security.xml
```
mvn --encrypt-master-password you_glorious_master_password
```
2. You encrypt you password and save to settings.xml in server block
```
mvn --encrypt-password you_accouunt_password -Dsettings.security=./settings_security.xml
```
3. Run you project with you enrypted password in safe way
```
mvn package exec:exec -s ./settings.xml -t ./toolchain.xml -Dsettings.security=./settings_security.xml
```