# swagger-springboot-demo
Demo project to understand how Swagger is used to create documentation of various REST endpoints of Spring Boot application

### Steps to add swagger to spring boot project
1. Getting the swagger 2 dependency
2. Enabling swagger in your code using **@EnableSwagger2** annotations
3. Configuring Swagger
4. Adding details as annotations to APIs

- add Spring fox swagger 2 dependency in pom.xml file

```
<!-- https://mvnrepository.com/artifact/io.springfox/springfox-swagger2 -->
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger2</artifactId>
    <version>2.9.2</version>
</dependency>
```

#### Issues encountered in the project
 - [issue 1 - stackoverflow sloution](https://stackoverflow.com/questions/40241843/failed-to-start-bean-documentationpluginsbootstrapper-in-spring-data-rest)

### To access docs provided by Swagger
- use the endpoint `http://localhost:8080/v2/api-docs` in your Rest client like Postman

### To get html documentations use another swagger dependency called `Springfox-swagger-UI`.

```aidl
<!-- https://mvnrepository.com/artifact/io.springfox/springfox-swagger-ui -->
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger-ui</artifactId>
    <version>2.9.2</version>
</dependency>
```

 - now access the endpoint `http://localhost:8080/swagger-ui.html` from your browser

## Demo of Swagger dashboard

![swagger dahboard]("images/swagger-ui-dashboard.jpg")