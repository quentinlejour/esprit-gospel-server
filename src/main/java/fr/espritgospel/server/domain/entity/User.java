package fr.espritgospel.server.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.NaturalId;

@EqualsAndHashCode(callSuper = true)
@Data
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@SuperBuilder(toBuilder = true)
@Entity(name = "user")
public class User extends AbstractEntity {

  @Column(name = "role", nullable = false)
  private UserRole role;

  @NaturalId
  @Column(name = "email", unique = true, nullable = false)
  private String email;

  @Column(name = "password", nullable = false)
  private String password;

  @Column(name = "is_disabled", nullable = false)
  private boolean isDisabled;

  @Column(name = "phone_number")
  private String phoneNumber;
}
