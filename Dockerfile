FROM amazoncorretto:17-alpine-jdk

MAINTAINER celinajure

COPY target/7Springboot-0.0.1-SNAPSHOT.jar 7Springboot-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/7Springboot-0.0.1-SNAPSHOT.jar"]






