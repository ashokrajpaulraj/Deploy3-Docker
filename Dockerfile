FROM openjdk:8
EXPOSE 8080
ADD target/Spring-Boot-Day-2-0.0.1-SNAPSHOT.jar Spring-Boot-Day-2-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java", "-jar", "/Spring-Boot-Day-2-0.0.1-SNAPSHOT.jar" ]