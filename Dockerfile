# FROM maven:3.9.4-eclipse-temurin-17 as builder
FROM maven:latest AS builder
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Run
FROM openjdk:21-jdk
WORKDIR /app
COPY --from=builder /app/target/UberEmailService.jar UberEmailService.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "UberEmailService.jar"]
