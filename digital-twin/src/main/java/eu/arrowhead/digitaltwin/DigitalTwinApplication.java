package eu.arrowhead.digitaltwin;

import eu.arrowhead.assettrackinglibrary.util.AssetTrackingProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "eu.arrowhead")
public class DigitalTwinApplication {

  final AssetTrackingProperties props;

  @Autowired
  public DigitalTwinApplication(final AssetTrackingProperties props) {
    this.props = props;
  }

  public static void main(String[] args) {
    SpringApplication.run(DigitalTwinApplication.class, args);
  }
}
