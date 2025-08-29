FROM --platform=linux/amd64 bellsoft/liberica-openjdk-alpine:21.0.1-12
ARG JAR_FILE=target/vaccination-control-info-service.jar
COPY ${JAR_FILE} vaccination-control-info-service.jar
RUN sh -c 'touch vaccination-control-info-service.jar'
ENV TZ=America/Guatemala
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
ENV JAVA_OPTS="-Xmx256m"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar vaccination-control-info-service.jar" ]