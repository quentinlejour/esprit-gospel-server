package fr.espritgospel.server.web.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import fr.espritgospel.server.domain.entity.Address;
import fr.espritgospel.server.web.dto.AddressDTO;
import org.junit.jupiter.api.Test;

class AddressMapperTest {
  @Test
  void map_modelToDTO() {
    var address =
        Address.builder()
            .internalAdditionalInfo("2nd floor")
            .externalAdditionalInfo("Church")
            .streetNumber(8)
            .streetName("Grande Rue")
            .zipCode("95000")
            .country("France")
            .build();

    var addressDTO = AddressMapper.map(address);
    assertEquals("2nd floor", addressDTO.internalAdditionalInfo());
    assertEquals("Church", addressDTO.externalAdditionalInfo());
    assertEquals(8, addressDTO.streetNumber());
    assertEquals("Grande Rue", addressDTO.streetName());
    assertEquals("95000", addressDTO.zipCode());
    assertEquals("France", addressDTO.country());
  }

  @Test
  void map_DTOToModel() {
    var addressDTO =
        new AddressDTO("1st floor", "Castle", 24, "Impasse Gambetta", "75000", "France");

    var address = AddressMapper.map(addressDTO);
    assertEquals("1st floor", address.getInternalAdditionalInfo());
    assertEquals("Castle", address.getExternalAdditionalInfo());
    assertEquals(24, address.getStreetNumber());
    assertEquals("Impasse Gambetta", address.getStreetName());
    assertEquals("75000", address.getZipCode());
    assertEquals("France", address.getCountry());
  }
}
