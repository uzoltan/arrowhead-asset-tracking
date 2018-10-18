package eu.arrowhead.assettrackinglibrary.util;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties("asset.tracking")
public class AssetTrackingProperties {

  private String eventHandlerUrl = "http://localhost:8454/eventhandler/subscription";

}
