FROM openjdk:21

COPY target/D387_sample_code-0.0.2-SNAPSHOT.jar target/D387_sample_code-0.0.2-SNAPSHOT.jar.original

WORKDIR /app

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app.jar"]