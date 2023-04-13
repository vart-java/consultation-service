FROM eclipse-temurin:17-jdk-alpine
RUN mkdir /app
COPY app.jar /app/app.jar
WORKDIR /app
ENTRYPOINT ["java","-jar","app.jar"]