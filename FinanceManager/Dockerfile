FROM daocloud.io/james_zhou/base-tomcat-maven:latest

MAINTAINER 21851172@zju.edu.cn

RUN mkdir -p /app
WORKDIR /app
COPY . /app

RUN mvn install

RUN cp /app/target/FinanceManager-1.0.war /usr/local/tomcat/webapps/finance.war
