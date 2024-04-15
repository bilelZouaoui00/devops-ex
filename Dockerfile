FROM openjdk:17
EXPOSE 8080
ADD target/DevopsIntegration.jar DevopsIntegration.jar
ENTRYPOINT ["java", "-jar", "/DevopsIntegration.jar"]