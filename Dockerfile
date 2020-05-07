FROM openjdk:8
EXPOSE 9000
ADD target/jenkin-docker.jar jenkin-docker.jar
ENTRYPOINT ["java", "-jar", "/jenkin-docker.jar"]