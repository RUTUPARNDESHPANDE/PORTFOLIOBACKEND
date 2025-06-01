# Stage 1: Build the app using Maven + JDK
FROM maven:3.9.1-eclipse-temurin-17 AS build

WORKDIR /app

# Copy pom.xml and source code
COPY pom.xml .
COPY src ./src

# Build the app and package JAR (skip tests for faster build)
RUN mvn clean package -DskipTests

# Stage 2: Run the app using lightweight OpenJDK image
FROM openjdk:17-jdk-alpine

WORKDIR /app

# Copy the built jar from the build stage
COPY --from=build /app/target/portfolioapi-0.0.1-SNAPSHOT.jar app.jar

# Expose port (default 8080 for Spring Boot)
EXPOSE 8080

# Run the jar
ENTRYPOINT ["java", "-jar", "app.jar"]
