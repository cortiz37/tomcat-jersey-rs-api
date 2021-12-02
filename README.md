# tomcat-jersey-rs-api

How to use jax-rs (jersey implementation) with Tomcat (not j2ee server)

---------

### building

- windows `gradlew.bat build`
- unix `./gradlew build`

### running

#### docker: 

- `docker build -t jersey-api .`
- `docker run --rm -it -p 8080:8080 jersey-api`

#### manually: 

- copy the war (build/libs/tomcat-jersey-rs-api.war) into tomcat webapps directory 

### checking
 
 - `http://localhost:8080/tomcat-jersey-rs-api/` will show (index JSP)
 
```
Index view
```

- `http://localhost:8080/tomcat-jersey-rs-api/rest/v1/entities` will show (rest controller)

```
Simple html response...
```

- `http://localhost:8080/tomcat-jersey-rs-api/rest/v1/entities/json` will show (rest controller, json path)

```
{"id":1638456518848,"active":true,"description":"example"}
```