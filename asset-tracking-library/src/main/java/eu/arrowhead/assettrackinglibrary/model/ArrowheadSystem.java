/*
 *  Copyright (c) 2018 AITIA International Inc.
 *
 *  This work is part of the Productive 4.0 innovation project, which receives grants from the
 *  European Commissions H2020 research and innovation programme, ECSEL Joint Undertaking
 *  (project no. 737459), the free state of Saxony, the German Federal Ministry of Education and
 *  national funding authorities from involved countries.
 */

package eu.arrowhead.assettrackinglibrary.model;

import lombok.Data;

@Data
public class ArrowheadSystem {

  private Long id;
  private String systemName;
  private String address;
  private Integer port;
  private String authenticationInfo;

  public ArrowheadSystem(String systemName, String address, Integer port) {
    this.systemName = systemName;
    this.address = address;
    this.port = port;
  }
}
