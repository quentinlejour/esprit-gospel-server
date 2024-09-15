package fr.espritgospel.server.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import java.time.ZonedDateTime;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@Entity(name = "concert")
public class Concert extends AbstractEntity {

  @Embedded private Address address;

  @Column(name = "date")
  private ZonedDateTime date;

  @Column(name = "description")
  private String description;
}
