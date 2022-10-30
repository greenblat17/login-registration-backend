# Login Registration Backend 

Complete login registration backend system using Spring Boot.

- [x] Spring Boot
- [x] Spring Security
- [x] Java Mail
- [x] Email verification with expiry
- [x] Spring Boot

## Diagram
![Screenshot 2021-01-13 at 23 38 08](https://user-images.githubusercontent.com/40702606/104789980-15581a00-578e-11eb-998d-30f2e6a9f461.png)

## Diagram
![Screenshot 2021-01-13 at 23 38 08](https://sun9-10.userapi.com/impg/igDfH-F9R1hdp336Ch8LXa6aQ_kQuRV9deaZJQ/qpMcuHJirNs.jpg?size=2560x1034&quality=96&sign=1e19eef67061a097ac8b63d09ea58a99&type=album)

### CURL
```
curl --location --request POST 'localhost:8080/api/v1/registration' \
--header 'Content-Type: application/json' \
--data-raw '{
    "firstName": "Tim",
    "lastName": "Jones",
    "email": "tim_jones@gmail.com",
    "password": "password"
}'
```

