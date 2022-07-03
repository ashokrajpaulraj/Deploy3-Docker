FROM openjdk:latest
EXPOSE 8081
ADD target/mydockerdeploy1.jar sbdockerdemo.jar
ENTRYPOINT ["java", "-jar", "sbdockerdemo.jar"]