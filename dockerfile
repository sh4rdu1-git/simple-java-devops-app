# Use official Java runtime
FROM openjdk:25-rc-slim

# Set working directory
WORKDIR /app

# Copy jar file
COPY target/*.jar app.jar

# Expose application port
EXPOSE 8080

# Run app
ENTRYPOINT [ "java", "-jar", "app.jar" ]