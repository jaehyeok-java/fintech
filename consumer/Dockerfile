FROM openjdk:21-jdk
RUN mkdir -p deploy
WORKDIR /deploy
COPY ./build/libs/consumer-0.0.1.jar consumer-jar
ENTRYPOINT ["java", "-jar", "/deploy/consumer-jar"]