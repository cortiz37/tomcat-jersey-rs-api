FROM tomcat:9.0.43-jdk15-openjdk

COPY build/libs/tomcat-jersey-rs-api.war /usr/local/tomcat/webapps/