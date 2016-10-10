crating new datasource

<datasource jta="true" jndi-name="java:jboss/datasources/ATENDIMENTO_DB" pool-name="atendimento" enabled="true" use-java-context="true" use-ccm="true">
    <!-- Aqui você deve colocar o endereço da sua base de dados -->
    <connection-url>jdbc:mysql://localhost:3306/ATENDIMENTO_DB</connection-url>
    <driver>mysql</driver>
    <transaction-isolation>TRANSACTION_READ_COMMITTED</transaction-isolation>
    <pool>
        <min-pool-size>10</min-pool-size>
        <max-pool-size>100</max-pool-size>
        <prefill>true</prefill>
    </pool>
    <security>
        <user-name>root</user-name>
        <password>root</password>
    </security>
    <statement>
        <prepared-statement-cache-size>32</prepared-statement-cache-size>
        <share-prepared-statements>true</share-prepared-statements>
    </statement>
</datasource>
<driver name="mysql" module="com.mysql">
    <xa-datasource-class>com.mysql.jdbc.jdbc2.optional.MysqlXADataSource</xa-datasource-class>
</driver>