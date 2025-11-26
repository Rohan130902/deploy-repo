# Use Java 17 runtime
FROM eclipse-temurin:17-jdk-jammy

# Set working dir inside container
WORKDIR /app

# Copy the built jar from target (we use wildcard so rename doesn’t matter)
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# Expose your app port (8081, since you configured SSL on 8081)
EXPOSE 8081

# Run the application
ENTRYPOINT ["java","-jar","/app/app.jar"]
