FROM java:openjdk-8-jdk
COPY target/versions-watch-1.0-SNAPSHOT-jar-with-dependencies.jar /versions-watch-1.0-SNAPSHOT-jar-with-dependencies.jar
CMD ["java", "-jar", "/versions-watch-1.0-SNAPSHOT-jar-with-dependencies.jar"]
EXPOSE 8080
