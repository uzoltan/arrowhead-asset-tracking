package eu.arrowhead.assettrackinglibrary.model;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import lombok.Data;

@Data
public class EventFilter {

  private String eventType;
  private ArrowheadSystem consumer;
  private Set<ArrowheadSystem> sources = new HashSet<>();
  private LocalDateTime startDate;
  private LocalDateTime endDate;
  private Map<String, String> filterMetadata = new HashMap<>();
  private String notifyUri;
  private Boolean matchMetadata;

}
