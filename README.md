# CRUD-Spring-Boot-JPA-MySQL
# CRUD Example of Spring-Boot-REST-JPA-Hibernate-MySQL-DevTool (BookStore)
## 1. You can clone it from github by running following command
```
 $ git clone git@github.com:atankit/Curd-RestApi.git
```
### 2. Import project into eclipse
```
  File -> Import -> Maven -> Existing Maven Projects -> Browse Project from cloned location
```
### 3. Right click on project in eclipse and then Maven -> Update Projects

### 4. Create Mysql database

    `create database book_db`
    
### 5. Change mysql username and password as per your installation

* open `src/main/resources/application.properties`

* change your `port number` , `spring.datasource.username` and `spring.datasource.password` as per your mysql installation

``` 
spring.datasource.url=jdbc:mysql://localhost:3305/book_db	
spring.datasource.username=root
spring.datasource.password=root 
```
### 6. Right click on Application.java file and run as Java Application

## Explore Rest APIs following Endpoints by using POSTMAN    

| Http Method | URL     | Description  | Valid HTTP status codes |
| :-------- | :------- | :------------------------- | :------ |
| **GET** | /books | Retrieve all book | 200,204,206
| **GET** | /books/2 | Read a book | 200
| **POST** | /books | Create a book | 201
### set content type as in header as `application/json`
### set request body as raw with JSON payload
```
  {
    "id": 2,
    "title": "Java",
    "author": {
        "authorId": 2,
        "firstName": "Abc",
        "lastName": "Def",
        "language": "English"
    }
}

```
| Http Method | URL     | Description  | Valid HTTP status codes |
| :-------- | :------- | :------------------------- | :------ |
| **PUT** | /books/2 | Update a book | 200
| **DELETE** | /books/2 | Delete a book | 204
| **POST** | /upload-file | Upload a image | 201

### Select Body -> form-data -> Enter your parameter name (file according to your code)
### On the right side of the Key field, while hovering your mouse over it, there is a dropdown menu to select between Text/File. Select File, then a "Select Files" button will appear in the Value field.

