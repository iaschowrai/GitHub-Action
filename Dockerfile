FROM openjdk:17-jdk

WORKDIR /app

COPY target/github-action-build-deploy-0.0.1-SNAPSHOT.jar /app/springboot.jar

EXPOSE 8080

CMD ["java", "-jar", "springdemo.jar"]
