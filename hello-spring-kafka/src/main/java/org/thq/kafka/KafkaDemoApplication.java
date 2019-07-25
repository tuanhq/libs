package org.thq.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class KafkaDemoApplication implements ApplicationRunner {
//   @Autowired
//   private KafkaTemplate<String, String> kafkaTemplate;
//
//   public void sendMessage(String msg) {
//      kafkaTemplate.send("Hello-Kafka", msg);
//   }
   public static void main(String[] args) {
      SpringApplication.run(KafkaDemoApplication.class, args);
   }
//   @KafkaListener(topics = "Hello-Kafka", groupId = "group-id")
//   public void listen(String message) {
//      System.out.println("Received Messasge in group - group-id: " + message);
//   }
   @Override
   public void run(ApplicationArguments args) throws Exception {
      System.out.println("Hi Welcome to Spring For Apache Kafka");
   }
}
