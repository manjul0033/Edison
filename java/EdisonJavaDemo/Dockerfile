# Build
FROM maven:3.5-jdk-8 AS build  
COPY src /usr/src/app/src  
COPY pom.xml /usr/src/app  
RUN mvn -f /usr/src/app/pom.xml clean package -Dmaven.test.skip=true

# Final Image
FROM gcr.io/distroless/java  
COPY --from=build /usr/src/app/target/EdisonJavaDemo-1.0.0.jar /usr/app/app.jar  
EXPOSE 8080  
ENTRYPOINT ["java","-jar","/usr/app/app.jar"] 
