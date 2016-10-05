# OrcaTrakKickoff

Tested under Payara Server (must configure the jdbc/orca JNDI)
Based on:
 BCE structure
 Java EE 7
 Hibernate JPA (with bytecode enhancement)
 JPA Modeler
 Logback
 
Before running for the first time you must create the schema via hibernate.properties:
hibernate.hbm2ddl.auto=create-drop

Afterwords, you can set:
hibernate.hbm2ddl.auto=none
