FROM openjdk:8
EXPOSE 9000
ADD target/jenkin-demo-0.0.1.jar jenkin-demo.0.0.1.jar
ENTRYPOINT ["java", "-jar", "/jenkin-demo.0.0.1.jar"]