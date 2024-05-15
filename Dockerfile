FROM openjdk:17-jdk
WORKDIR /app
COPY build/libs/test.jar app.jar
EXPOSE 8080

CMD ["java", "-jar", "app.jar"]