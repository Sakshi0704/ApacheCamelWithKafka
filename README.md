
## Kafka and Apache Camel Integration with Docker Compose

This project demonstrates **Apache Camel integration with Kafka** using a simple producer-consumer setup in a Spring Boot application. It helps understand how to work with **Kafka topics**, **producers**, **consumers**, and how Camel simplifies the message routing.

---

## 🔧 Tech Stack

- Java 17+
- Spring Boot
- Apache Camel
- Kafka (via Docker)
- Docker Compose

---

## 🧠 Concepts Covered

- What is Kafka?
- Topics, Brokers, Producers, Consumers
- Apache Camel Kafka Integration
- Difference between Spring Kafka & Apache Camel Kafka
- Creating Camel Routes for sending and receiving messages
- Configuring Docker Compose for Zookeeper and Kafka

---

## 📦 Kafka Components Explained

| Term      | Description                                                                 |
|-----------|-----------------------------------------------------------------------------|
| **Broker** | A Kafka server that stores data and serves clients.                        |
| **Topic**  | A named stream of records (e.g., `topicNameOne`).                          |
| **Producer** | Sends messages to a Kafka topic.                                          |
| **Consumer** | Reads messages from a Kafka topic.                                        |
| **Zookeeper** | Manages Kafka cluster metadata and leader election (required by Kafka). |

---

## ⚖️ Spring Kafka vs Apache Camel Kafka

| Feature                         | **Spring Kafka**                                      | **Apache Camel Kafka**                                      |
|---------------------------------|--------------------------------------------------------|-------------------------------------------------------------|
| Abstraction Level              | Low-level (you manage producer/consumer logic)        | High-level (declarative routing with DSL)                   |
| Configuration                  | Manual with properties and annotations                | Routes are configured using Camel DSL                       |
| Flexibility                    | Offers more fine-grained control                      | Offers faster development with reusable route definitions   |
| Integration Capability         | Kafka-specific                                         | Supports multiple systems (Kafka, JMS, File, REST, etc.)    |
| Learning Curve                 | Moderate to High                                       | Easier for routing but needs learning Camel terminology     |

---

## 🚀 How to Run the Project

### 1. Clone the Repository

```bash
git clone https://github.com/Sakshi0704/Apache_Camel_V1.git
cd Apache_Camel_V1
```

### 2. Start Kafka and Zookeeper via Docker Compose

```bash
docker-compose up -d
```

This will start:
- Zookeeper on `localhost:2181`
- Kafka on `localhost:9092`

### 3. Run the Spring Boot Application

```bash
./mvnw spring-boot:run
```

Or run it from your IDE.

---

## ✅ What to Expect

- KafkaSenderRoute will send a message every second to `topicNameOne`.
- KafkaReceiverRoute will consume the message and log it to the console.

Example Output:

```log
INFO  route1 : Send the message to consumer
INFO  route2 : Send the message to consumer
```

---

## 🧪 Testing the Setup

You can verify Kafka is working by:

### ✅ Using a Kafka CLI consumer (optional)

```bash
docker exec -it kafka /bin/bash
kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic topicNameOne --from-beginning
```

---

## 📁 Folder Structure

```
ApacheCamelWithKafka/
│
├── docker-compose.yml          # Kafka & Zookeeper setup
├── pom.xml                     # Maven dependencies
├── src/
│   └── main/java/
│       └── com/apachecamel/routes/
│           ├── KafkaSenderRoute.java
│           └── KafkaReceiverRoute.java
└── README.md                   # Project documentation
```
