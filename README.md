# spring-boot-reactive-postgres-demo
 Spring Boot API with stream of postgres database table. WebFlux and R2DBC (-> provides reactive repository for postgres) used. Non-blocking threads + asynchronous data load with subscriber and publisher.

### Endpoints

- /api -> get all Members from table streamed to subscriber (client)
- /api/{name} -> get specific Member by name
- /api/create/{name} -> Add new Member to table
- /api/delete/{name} -> Delete member from table
