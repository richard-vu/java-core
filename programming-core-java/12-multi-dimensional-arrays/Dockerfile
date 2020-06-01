FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/application.jar
ARG JAR_LIB_FILE=target/lib

# cd /usr/local/runme
WORKDIR /usr/local/runme

# cp target/application.jar /usr/local/runme/application.jar
COPY ${JAR_FILE} application.jar

# cp -rf target/lib/  /usr/local/runme/lib
ADD ${JAR_LIB_FILE} lib/

# java -jar /usr/local/runme/app.jar
ENTRYPOINT ["java","-jar","application.jar"]