FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY target/*.jar medical-clinic-1.0.jar

ENTRYPOINT ["java", "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005", "-jar", "medical-clinic-1.0.jar"]
