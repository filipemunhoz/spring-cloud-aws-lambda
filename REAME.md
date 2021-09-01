


Springboot
2.4.10 - Needs this version to prevents incompability on maven repackage on Springboot version 2.5

https://www.youtube.com/watch?v=s4BT7Ob5tjA


https://github.com/spring-cloud/spring-cloud-function/blob/main/spring-cloud-function-samples/function-sample-aws/pom.xml


GET
localhost:8080/students


POST
localhost:8080/findByName
body -> raw -> Joshua

POST
localhost:8080/myConsumer
body -> raw -> "texto livre" (sairá no log do Consumer)

POST
localhost:8080/myConsumerBean
body -> raw -> "texto livre" (sairá no log do Consumer)



Failed to execute goal [32morg.springframework.boot:spring-boot-maven-plugin:2.5.4:repackage[m [1m(repackage)[m on project [36mspring-cloud-aws-lambda[m: [1;31mExecution repackage of goal org.springframework.boot:spring-boot-maven-plugin:2.5.4:repackage failed: An API incompatibility was encountered while executing org.springframework.boot:spring-boot-maven-plugin:2.5.4:repackage: java.lang.AbstractMethodError: Receiver class org.springframework.boot.loader.thin.ThinLayout does not define or inherit an implementation of the resolved method 'abstract java.lang.String getLibraryLocation(java.lang.String, org.springframework.boot.loader.tools.LibraryScope)' of interface org.springframework.boot.loader.tools.Layout.
