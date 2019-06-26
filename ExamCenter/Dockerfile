FROM maven:3.3.9-jdk-8-alpine
COPY . /app
WORKDIR /app
RUN echo http://mirrors.ustc.edu.cn/alpine/v3.8/main > /etc/apk/repositories
RUN echo http://mirrors.ustc.edu.cn/alpine/v3.8/community >> /etc/apk/repositories
RUN apk update && apk add mysql mysql-client
ENTRYPOINT ["/app/custom-entrypoint.sh"]
CMD java -jar target/*.jar
