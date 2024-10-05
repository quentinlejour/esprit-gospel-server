package fr.espritgospel.server.web.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import fr.espritgospel.server.domain.entity.Address;
import fr.espritgospel.server.domain.entity.Concert;
import fr.espritgospel.server.web.dto.AddressDTO;
import fr.espritgospel.server.web.dto.ConcertDTO;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import org.junit.jupiter.api.Test;

public class ConcertMapperTest {

  private static final ZonedDateTime DUMMY_DATE =
      ZonedDateTime.parse("2024-12-25T21:00:00+01:00", DateTimeFormatter.ISO_OFFSET_DATE_TIME);

  @Test
  void map_modelToDTO() {
    var concert =
        Concert.builder()
            .id(1L)
            .address(
                Address.builder()
                    .internalAdditionalInfo("2nd floor")
                    .externalAdditionalInfo("Church")
                    .streetNumber(8)
                    .streetName("Grande Rue")
                    .zipCode("95000")
                    .country("France")
                    .build())
            .date(DUMMY_DATE)
            .description("Great concert")
            .build();

    var concertDTO = ConcertMapper.map(concert);
    assertEquals(1L, concertDTO.id());
    assertEquals(DUMMY_DATE, concertDTO.date());
    assertEquals("Great concert", concertDTO.description());

    var addressDTO = concertDTO.address();
    assertEquals("2nd floor", addressDTO.internalAdditionalInfo());
    assertEquals("Church", addressDTO.externalAdditionalInfo());
    assertEquals(8, addressDTO.streetNumber());
    assertEquals("Grande Rue", addressDTO.streetName());
    assertEquals("95000", addressDTO.zipCode());
    assertEquals("France", addressDTO.country());
  }

  @Test
  void map_DTOToModel() {
    var concertDTO =
        new ConcertDTO(
            1L,
            new AddressDTO("1st floor", "Castle", 24, "Impasse Gambetta", "75000", "France"),
            DUMMY_DATE,
            "Great concert");

    var concert = ConcertMapper.map(concertDTO);
    assertEquals(1L, concert.getId());
    assertEquals(DUMMY_DATE, concert.getDate());
    assertEquals("Great concert", concert.getDescription());

    var address = concert.getAddress();
    assertEquals("1st floor", address.getInternalAdditionalInfo());
    assertEquals("Castle", address.getExternalAdditionalInfo());
    assertEquals(24, address.getStreetNumber());
    assertEquals("Impasse Gambetta", address.getStreetName());
    assertEquals("75000", address.getZipCode());
    assertEquals("France", address.getCountry());
  }
}
