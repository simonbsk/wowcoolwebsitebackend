# Use an official OpenJDK runtime as a base image
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the target directory into the container at /app
COPY target/wowcoolwebsitebackend-0.0.1-SNAPSHOT.jar /app

# Expose the port that your application runs on
EXPOSE 8080

# Specify the command to run on container startup
CMD ["java", "-jar", "wowcoolwebsitebackend-0.0.1-SNAPSHOT.jar"]
