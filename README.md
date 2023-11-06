# zerobase-stock

> src/main/resources/application.yml
```java
spring:
  application:
    name: dayone-financial

  h2:
    console:
      enabled: true
      path: /h2-console

  jpa:
    hibernate:
      ddl-auto: create
      use-new-id-generator-mappings: false
    show-sql: true
    defer-datasource-initialization: true

  datasource:
    driverClassName: org.h2.Driver
    url: jdbc:h2:mem:dayone:DB_CLOSE_DELAY=-1
    username: sa
    password:

  data:
    redis:
      host: localhost
      port: 6379
  jwt:
    secret: "jwtSecretKey"

scheduler:
  scrap:
    yahoo: "0 0 0 * * *"
```
