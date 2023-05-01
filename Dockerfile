FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ./target/spring-boot-containerizing-0.0.1-SNAPSHOT.jar demo.jar
ENTRYPOINT ["java", "-jar", "demo.jar"]