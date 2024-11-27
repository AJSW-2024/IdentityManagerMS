FROM openjdk:22-jdk
COPY IdentityManagementMS-0.0.1-SNAPSHOT.jar identity-management.jar
EXPOSE 9000
ENTRYPOINT ["java", "-jar", "identity-management.jar"]