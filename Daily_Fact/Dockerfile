# Use a base Docker image with JDK pre-installed
FROM openjdk:11

# Set the working directory in the Docker container
WORKDIR /app

# Copy the Micronaut project JAR file into the Docker container
COPY build/libs/*.jar app.jar

# Expose the port used by your Micronaut application
EXPOSE 8080

# Define the command to run your Micronaut application when the Docker container starts
CMD ["java", "-jar", "app.jar"]
