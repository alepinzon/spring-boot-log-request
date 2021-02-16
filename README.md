# spring-boot-log-request

To test the endpoints and check the request log, we can use the following commands:

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




