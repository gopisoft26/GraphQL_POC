FROM amazoncorretto:17
WORKDIR /app
COPY target/GraphQL_POC-0.0.1.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]