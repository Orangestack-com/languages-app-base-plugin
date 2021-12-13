FROM amazoncorretto:11
RUN yum -y update
ARG JAR_FILE=*-all.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]