# Read Me First

The following was discovered as part of building this project:

* The JVM level was changed from '11' to '17', review
  the [JDK Version Range](https://github.com/spring-projects/spring-framework/wiki/Spring-Framework-Versions#jdk-version-range)
  on the wiki for more details.

# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.5/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.0.5/gradle-plugin/reference/html/#build-image)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/3.0.5/reference/htmlsingle/#appendix.configuration-metadata.annotation-processor)
* [Spring Data MongoDB](https://docs.spring.io/spring-boot/docs/3.0.5/reference/htmlsingle/#data.nosql.mongodb)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.0.5/reference/htmlsingle/#web)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/3.0.5/reference/htmlsingle/#actuator)
* [Spring Data JDBC](https://docs.spring.io/spring-boot/docs/3.0.5/reference/htmlsingle/#data.sql.jdbc)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.0.5/reference/htmlsingle/#using.devtools)

### Guides

The following guides illustrate how to use some features concretely:

* [Accessing Data with MongoDB](https://spring.io/guides/gs/accessing-data-mongodb/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)
* [Using Spring Data JDBC](https://github.com/spring-projects/spring-data-examples/tree/master/jdbc/basics)

### Additional Links

These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)


### Create a monogodb database

```bash
docker run -d -p 27017:27017 --name mongodb mongo
```



### Some issues

Caused by: com.mongodb.MongoSecurityException: Exception authenticating MongoCredential{mechanism=SCRAM-SHA-1, userName='root', source='mydb', password=<hidden>, mechanismProperties=<hidden>}

solution: add ?authSource=admin to the uri

spring.data.mongodb.uri=mongodb://root:example@localhost:37017/mydb?authSource=admin


### TODOs
remove java mongodb _class filed

