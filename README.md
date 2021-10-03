# spring-boot-reactive-postgres-demo
 Spring Boot API with stream of postgres database table. WebFlux and R2DBC (-> provides reactive repository for postgres) used. Non-blocking threads + asynchronous data load with subscriber and publisher.

### Endpoints

- /api -> get all Members from table streamed to subscriber (client)
- /api/{name} -> get specific Member by name
- /api/create/{name} -> Add new Member to table
- /api/delete/{name} -> Delete member from table

A scheduler is running every 20s which retrieves the streamed data from /api endpoint to demonstrate the function of WebClient for reactive.

Got inspiration by: https://dassum.medium.com/building-a-reactive-restful-web-service-using-spring-boot-and-postgres-c8e157dbc81d
