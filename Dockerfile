FROM openjdk:11
EXPOSE 8085
ADD target/jenkinswithdocker.jar jenkinswithdocker.jar
ENTRYPOINT ["java","-jar","/jenkinswithdocker.jar"]