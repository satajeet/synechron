FROM openjdk:11-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} loan-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/loan-0.0.1-SNAPSHOT.jar"]