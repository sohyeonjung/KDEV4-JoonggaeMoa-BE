FROM openjdk:17
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
#COPY src/main/resources/application-prod.yml /application-prod.yml
ENV TZ=Asia/Seoul
ENTRYPOINT ["java","-Dspring.profiles.active-prod", "-jar", "/app.jar"]