# Basic Java Application for DevOps

## Description
Simple Java Spring Boot application for DevOps practice.

## Endpoints
- GET /hello
- GET /health

## Run locally
```mvn spring-boot:run```

## Run with Docker (Pull Image)
```docker pull ghcr.io/sh4rdu1-git/simple-java-devops-app/java-devops-app:latest```

## Run with Docker (Build Image from source)
```docker build -t java-devops-app:<TAG>```

```docker run -p 8080:8080 java-devops-app:<TAG>```
