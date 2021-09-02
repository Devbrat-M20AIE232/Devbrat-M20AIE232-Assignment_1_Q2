FROM adoptopenjdk/openjdk11:latest
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} docker-project-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/docker-project-0.0.1-SNAPSHOT.jar"]