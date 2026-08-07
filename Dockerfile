FROM eclipse-temurin:21
LABEL maintainer="futflow"
WORKDIR /futflow10x
COPY target/futFlow-0.0.1-SNAPSHOT.jar /futflow10x/futflow-docker.jar
ENTRYPOINT ["java", "-jar", "futflow-docker.jar"]
