package eu.arrowhead.digitaltwin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "eu.arrowhead")
public class DigitalTwinApplication {

  public static void main(String[] args) {
    SpringApplication.run(DigitalTwinApplication.class, args);
  }
}
