package fr.espritgospel.server.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import java.time.ZonedDateTime;
import lombok.AccessLevel;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.UpdateTimestamp;

@Data
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
@SuperBuilder(toBuilder = true)
@MappedSuperclass
public abstract class AbstractEntity {
  @Setter(AccessLevel.PROTECTED)
  @Id
  @GeneratedValue
  @Column(name = "id", unique = true, updatable = false, insertable = false)
  private long id;

  @Setter(AccessLevel.PROTECTED)
  @CreationTimestamp
  @Immutable
  @Column(name = "created_at", updatable = false, insertable = false)
  private ZonedDateTime createdAt;

  @Setter(AccessLevel.PROTECTED)
  @UpdateTimestamp
  @Column(name = "updated_at", updatable = false, insertable = false)
  private ZonedDateTime updatedAt;
}
