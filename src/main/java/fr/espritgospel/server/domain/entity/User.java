package fr.espritgospel.server.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@Entity(name = "user")
public class User extends AbstractEntity {

  @Column(name = "role")
  private UserRole role;

  @Column(name = "email")
  private String email;

  @Column(name = "password")
  private String password;

  @Column(name = "is_disabled")
  private boolean isDisabled;
}
