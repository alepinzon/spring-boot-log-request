# spring-boot-log-request

This example logs every HTTP request using a CommonsRequestLoggingFilter in a Spring boot application
<br>
You can test the endpoints and check the request logs with the following commands:

Foo


GET
```
curl --location --request GET 'http://127.0.0.1:8080/hello?foo=1&bar=2' \
--data-raw ''
```

POST
```
curl --location --request POST 'http://127.0.0.1:8080/hello?foo=1&bar=2' \
--header 'Content-Type: application/json' \
--data-raw '{
    "hello": "Bonjour",
    "world": "le monde"
}'
```
PUT
```
curl --location --request PUT 'http://127.0.0.1:8080/hello' \
--header 'Content-Type: application/json' \
--data-raw '{
    "hello": "Ciao",
    "world": "Mondo"
}'
```
POST - EXCEPTION
```
curl --location --request POST 'http://127.0.0.1:8080/exception' \
--header 'Content-Type: application/json' \
--data-raw '{
    "hello": "Hallo",
    "world": "Welt"
}'
```




