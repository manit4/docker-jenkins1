From openjdk:17
EXPOSE 8080
ADD target/devops-inte.jar devops-inte.jar
ENTRYPOINT ["java", "-jar", "/devops-inte.jar"]