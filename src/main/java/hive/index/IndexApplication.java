package hive.index;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class IndexApplication {

  public static void main(String[] args) {
    SpringApplication.run(IndexApplication.class, args);
  }

}
