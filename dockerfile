# Use official Java runtime
FROM eclipse-temurin:25-jre-alpine-3.22

# Set working directory
WORKDIR /app

# Copy jar file
COPY target/*.jar app.jar

# Expose application port
EXPOSE 8080

# Run app
ENTRYPOINT [ "java", "-jar", "app.jar" ]

# Label for image
LABEL version="1.0.3"