FROM openjdk:8-jre-alpine

COPY target/smart-bank-api.jar smart-bank-api.jar
ENTRYPOINT ["java", "-jar", "smart-bank-api.jar"]
