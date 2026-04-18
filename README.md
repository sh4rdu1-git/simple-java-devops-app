# Basic Java Application for DevOps

## Description
Simple Java Spring Boot application for DevOps practice.

## Endpoints
- GET /hello
- GET /health

## Run locally
```mvn spring-boot:run```

## Run with Docker
```docker build -t java-devops-app:1.0.1```

```docker run -p 8080:8080 java-devops-app:1.0.1```
