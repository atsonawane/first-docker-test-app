FROM openjdk:17
EXPOSE 8080
ADD target/first-docker-test-app.jar first-docker-test-app.jar
ENTRYPOINT [ "java","-jar","first-docker-test-app.jar" ]

# docker build -t first-docker-test-app .
# docker run -p 8080:8080 first-docker-test-app