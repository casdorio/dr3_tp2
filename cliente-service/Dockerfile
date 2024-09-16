FROM openjdk:17-jdk-slim

EXPOSE 8080

WORKDIR /app

COPY target/cliente-service-0.0.1-SNAPSHOT.jar cliente-service.jar

ENTRYPOINT ["java", "-jar", "cliente-service.jar"]