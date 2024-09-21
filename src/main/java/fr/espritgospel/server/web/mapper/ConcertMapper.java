package fr.espritgospel.server.web.mapper;

import fr.espritgospel.server.domain.entity.Concert;
import fr.espritgospel.server.web.dto.ConcertDTO;
import javax.annotation.Nonnull;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ConcertMapper {

  /**
   * Creates a new instance of {@link Concert} from a {@link ConcertDTO}.
   *
   * @param concertDTO the {@link ConcertDTO} to map the {@link Concert} with.
   * @return a new {@link Concert} instance created from a {@link ConcertDTO}.
   */
  @Nonnull
  public Concert map(@Nonnull ConcertDTO concertDTO) {
    return Concert.builder()
        .id(concertDTO.id())
        .date(concertDTO.date())
        .address(concertDTO.address())
        .description(concertDTO.description())
        .build();
  }

  /**
   * Creates a new instance of {@link ConcertDTO} from a {@link Concert}.
   *
   * @param concert the {@link Concert} to map the {@link ConcertDTO} with.
   * @return a new {@link ConcertDTO} instance created from a {@link Concert}.
   */
  @Nonnull
  public ConcertDTO map(@Nonnull Concert concert) {
    return new ConcertDTO(
        concert.getId(), concert.getAddress(), concert.getDate(), concert.getDescription());
  }
}
