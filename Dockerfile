FROM openjdk:17-jdk

WORKDIR /app

COPY target/springdemo-1.0.0.jar /app/springboot.jar

EXPOSE 8080

CMD ["java", "-jar", "springdemo.jar"]
