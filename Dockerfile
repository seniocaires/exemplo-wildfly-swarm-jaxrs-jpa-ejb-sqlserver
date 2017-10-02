FROM maven:3 AS builder

WORKDIR /builds

ADD . /builds

RUN mvn package

FROM java:8

COPY --from=builder /builds/target/exemplo-wildfly-swarm-jaxrs-jpa-ejb-sqlserver-swarm.jar /app/run.jar

WORKDIR /app

EXPOSE 8080

ENTRYPOINT ["/bin/bash", "-c", "/usr/lib/jvm/java-8-openjdk-amd64/bin/java -Djava.net.preferIPv4Stack=true -Dswarm.ds.name=$DS_NAME -Dswarm.jdbc.driver=sqlserver -Dswarm.ds.connection.url=$DS_CONNECTION_URL -Dswarm.ds.username=$DS_USERNAME -Dswarm.ds.password=$DS_PASSWORD -jar run.jar"]