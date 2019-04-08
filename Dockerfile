FROM java:8
MAINTAINER Rajashekhar Y
ADD target/DemoAws.jar DemoAws.jar
ENTRYPOINT ["java","-jar","DemoAws.jar"]
