package eu.arrowhead.assettrackinglibrary.model;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
public class Event {

  @NotBlank
  @Size(max = 255, message = "Event type must be 255 character at max")
  private String type;
  private String payload;
  private LocalDateTime timestamp;
  private Map<String, String> eventMetadata = new HashMap<>();

}
