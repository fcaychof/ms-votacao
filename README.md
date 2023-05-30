# ms-votacao
## Pre-requisitos

Kafka

## Instalação

### KAFKA
### pull
```
docker pull spotify/kafka
```
### run
```
sudo docker run -d -p 2181:2181 -p 9092:9092 --env ADVERTISED_HOST=localhost --env ADVERTISED_PORT=9092 --env KAFKA_ADVERTISED_HOST_NAME=localhost --env KAFKA_ADVERTISED_PORT=9092 --name kafka spotify/kafka
```
### new topic
```
sudo docker exec kafka /opt/kafka_2.11-0.10.1.0/bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic votacao
```
### new producer
```
sudo docker run -it --rm --link kafka spotify/kafka /opt/kafka_2.11-0.10.1.0/bin/kafka-console-producer.sh --broker-list kafka:9092 --topic votacao
```
### new consumer
```
sudo docker run -it --rm --link kafka spotify/kafka /opt/kafka_2.11-0.10.1.0/bin/kafka-console-consumer.sh --bootstrap-server kafka:9092 --topic votacao --from-beginning
```

### SWAGGER
```
http://localhost:8080/ms-votacao/swagger-ui.html
```

### ACTUATOR
```
http://localhost:8080/ms-votacao/actuator
```
```
http://localhost:8080/ms-votacao/actuator/health
```

## Desenvolvido com:

* [Springboot](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/) - The web framework used
* [Lombok](https://projectlombok.org/features/all) - The build tools framework
* [Hibernate](https://hibernate.org/orm/documentation/5.4/) - The Object/Relational Mapping (ORM) framework
* [Maven](https://maven.apache.org/) - Dependency Management
* [Swagger](https://swagger.io/specification/) - The API design framework
* [Kafka](https://kafka.apache.org/) - Apache Kafka


## Autor

* **Fernando Miguel Caycho Feria** - *Initial work* - [fcaychof](https://github.com/fcaychof)

