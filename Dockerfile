FROM tomcat:9.0

MAINTAINER 21851172@zju.edu.cn

COPY exploded.war /usr/local/tomcat/webapps/exploded.war
