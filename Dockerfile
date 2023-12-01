FROM openjdk:11
EXPOSE 8092

ADD target/Projet-MicroService-0.0.1-SNAPSHOT.jar Projet-MicroService.jar
ENTRYPOINT ["java","-jar","Projet-MicroService.jar"]