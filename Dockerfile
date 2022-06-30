From openjdk:8
Expose 8080
Add target/Spring-Boot-Day-2-0.0.1-SNAPSHOT.jar Spring-Boot-Day-2-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java", "-jar", "/Spring-Boot-Day-2-0.0.1-SNAPSHOT.jar" ]