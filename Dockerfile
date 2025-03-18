# Use official OpenJDK image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy the built jar file from target folder to /app
COPY target/*.jar app.jar

# Expose port 8080
EXPOSE 7000

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
