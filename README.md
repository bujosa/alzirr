# alzirr
This is my first project related with the Spring Boot ecosystem, I want to achieve with this project, understand what the architecture and structure of this framework is like. ​

## Getting Started

### Prerequisites

- Java 17
- Maven 3.8.2

### Installing

- Clone the repository
- Run the command `mvn clean install` in the root of the project

### Running the application

- Run the command `mvn spring-boot:run` in the root of the project

### Running the application with Docker

- Run the command `docker build -t alzirr .` in the root of the project
- Run the command `docker run -p 8080:8080 alzirr`

### Endpoints

- Swagger UI: http://localhost:8080/swagger-ui.html
- Hello World: http://localhost:8080/ - GET
    ```bash
    curl --location --request GET 'http://localhost:8080/'
    ```
- Hello World with Your Name: http://localhost:8080 - POST - Body: { "name": "Your Name" }
    ```bash
    curl --location --request POST 'http://localhost:8080/' \ 
    --header 'Content-Type: application/json' \
    --data-raw '{
        "name": "Your Name"
    }'
    ```

## Official Documentation

- [Spring Boot](https://spring.io/projects/spring-boot)
