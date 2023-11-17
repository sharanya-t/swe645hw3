FROM ubuntu
RUN apt-get update && apt-get install -y openjdk-17-jdk
ADD target/studentsurvey-0.0.1-SNAPSHOT.jar studentsurvey-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "studentsurvey-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080