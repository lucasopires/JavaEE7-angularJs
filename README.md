# JavaEE7-angularJs

> First, you need to create a new schema with name "ATENDIMENTO_DB" in your database

##Example 
## Configuring WildFly10

### Creating a new module driver

> You need to create at wildfly/modules/com/mysql/main/ the xml below

```
<?xml version="1.0" encoding="UTF-8"?>
<module xmlns="urn:jboss:module:1.1" name="com.mysql">
    <resources>
        <resource-root path="mysql-connector-java-5.1.39.jar"/>
    </resources>
    <dependencies>
        <module name="javax.api"/>
        <module name="javax.transaction.api"/>
        <module name="javax.servlet.api" optional="true"/>
    </dependencies>
</module>
```
> After that, you need to download of the mysql connector with a version and save in the same directory above
https://mvnrepository.com/artifact/mysql/mysql-connector-java/5.1.39

### Creating a new driver
```
<driver name="mysql" module="com.mysql">
    <xa-datasource-class>com.mysql.jdbc.jdbc2.optional.MysqlXADataSource</xa-datasource-class>
</driver>
```

### Creating a new datasource
```
<datasource jndi-name="java:jboss/datasources/ATENDIMENTO_DB" pool-name="ATENDIMENTO_DB" enabled="true" use-java-context="true">
    <connection-url>jdbc:mysql://localhost:3306/ATENDIMENTO_DB</connection-url>
    <driver>mysql</driver>
    <security>
        <user-name>root</user-name>
        <password>almoXarifado</password>
    </security>
</datasource>
```
