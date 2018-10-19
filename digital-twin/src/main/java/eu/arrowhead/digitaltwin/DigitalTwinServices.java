package eu.arrowhead.digitaltwin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DigitalTwinServices {

  private static final RestTemplate REQUEST_SENDER = new RestTemplate();

  private final String eventHandlerUrl;
  private final String myHost;
  private final int myPort;

  @Autowired
  public DigitalTwinServices(@Value("${event_handler_url}") String eventHandlerUrl, @Value("${server.address}") String myHost,
                             @Value("${server.port}") int myPort) {
    this.eventHandlerUrl = eventHandlerUrl;
    this.myHost = myHost;
    this.myPort = myPort;
  }

  static void subscribeToSmartProductEvents() {

  }

}
