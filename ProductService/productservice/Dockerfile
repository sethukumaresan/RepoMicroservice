# Step 1: Use the openjdk:17-jdk-slim base image
FROM openjdk:17-jdk-slim

# Step 2: Set the working directory inside the container
WORKDIR /app

# Step 3: Copy the JAR file to the container
COPY target/productservice-0.0.1-SNAPSHOT.jar /app/productservice.jar

# Step 4: Expose the application port
EXPOSE 8080

# Step 5: Run the JAR file
ENTRYPOINT ["java", "-jar", "/app/productservice.jar"]
