# CRUD-Spring-Boot-JPA-MySQL
# CRUD Example of Spring-Boot-REST-JPA-Hibernate-MySQL-DevTool (BookStore)
## 1. You can clone it from github by running following command
```
 $ git clone git@github.com:atankit/CurdAPI.git
```
### 2. Import project into eclipse
```
  File -> Import -> Maven -> Existing Maven Projects -> Browse Project from cloned location
```
### 3. Right click on project in eclipse and then Maven -> Update Projects

### 4. Create Mysql database

    `create database springjpa_db`
    
### 5. Change mysql username and password as per your installation

* open `src/main/resources/application.properties`

* change your `port number` , `spring.datasource.username` and `spring.datasource.password` as per your mysql installation

``` 
spring.datasource.url=jdbc:mysql://localhost:3305/springjpa	
spring.datasource.username=root
spring.datasource.password=root 
```
### 6. Right click on Application.java file and run as Java Application

## Once Sprint Boot Application will be started successfully then we can call following Endpoints by using POSTMAN    
