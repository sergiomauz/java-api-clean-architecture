FROM eclipse-temurin:21-jdk

# Install Maven
RUN apt-get update && \
    apt-get install -y maven && \
    rm -rf /var/lib/apt/lists/*

# Move to workspace directory
WORKDIR /home/app

# Copy pom.xml and install dependencies
COPY pom.xml /home/app/pom.xml
RUN mvn dependency:go-offline -B

# Run maven and spring boot
CMD ["mvn", "spring-boot:run", "-Dspring-boot.run.jvmArguments=-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005"]

#
HEALTHCHECK --interval=5s --timeout=2s --retries=15 CMD /bin/sh -c "curl -f http://localhost:8080/ && nc -z localhost 5005"
