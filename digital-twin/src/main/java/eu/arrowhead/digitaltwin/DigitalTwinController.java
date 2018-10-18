package eu.arrowhead.digitaltwin;

import eu.arrowhead.assettrackinglibrary.model.Event;
import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DigitalTwinController {

  public static final String RECEIVE_EVENT_SUBPATH = "notifiy";
  private static final Logger log = LoggerFactory.getLogger(DigitalTwinController.class);

  @PostMapping(RECEIVE_EVENT_SUBPATH)
  public ResponseEntity<?> receiveEvent(@Valid @RequestBody Event event) {
    log.debug("Received new event: " + event.toString());
    handleEvent(event);
    return ResponseEntity.ok().build();
  }

  public void handleEvent(Event event) {

  }

}
