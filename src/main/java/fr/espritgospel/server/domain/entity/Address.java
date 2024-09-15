package fr.espritgospel.server.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Embeddable
public class Address {

  @Column(name = "address_internal_additional_info")
  private String internalAdditionalInfo;

  @Column(name = "address_external_additional_info")
  private String externalAdditionalInfo;

  @Column(name = "address_street_number")
  private int streetNumber;

  @Column(name = "address_street_name")
  private String streetName;

  @Column(name = "zip_code")
  private String zipCode;

  @Column(name = "country")
  private String country;
}
