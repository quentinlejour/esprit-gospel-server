package fr.espritgospel.server.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import java.time.ZonedDateTime;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@SuperBuilder(toBuilder = true)
@Entity(name = "concert")
public class Concert extends AbstractEntity {

  @Embedded private Address address;

  @Column(name = "date", nullable = false)
  private ZonedDateTime date;

  @Column(name = "description")
  private String description;
}
