package fr.espritgospel.server.web.mapper;

import fr.espritgospel.server.domain.entity.Address;
import fr.espritgospel.server.web.dto.AddressDTO;
import javax.annotation.Nonnull;
import lombok.experimental.UtilityClass;

@UtilityClass
public class AddressMapper {

  /**
   * Creates a new instance of {@link Address} from an {@link AddressDTO}.
   *
   * @param addressDTO the {@link AddressDTO} to map the {@link Address} with.
   * @return a new {@link Address} instance created from a {@link AddressDTO}.
   */
  @Nonnull
  public Address map(@Nonnull AddressDTO addressDTO) {
    return Address.builder()
        .internalAdditionalInfo(addressDTO.internalAdditionalInfo())
        .externalAdditionalInfo(addressDTO.externalAdditionalInfo())
        .streetNumber(addressDTO.streetNumber())
        .streetName(addressDTO.streetName())
        .zipCode(addressDTO.country())
        .country(addressDTO.country())
        .build();
  }

  /**
   * Creates a new instance of {@link AddressDTO} from an {@link Address}.
   *
   * @param address the {@link Address} to map the {@link AddressDTO} with.
   * @return a new {@link AddressDTO} instance created from a {@link Address}.
   */
  @Nonnull
  public AddressDTO map(@Nonnull Address address) {
    return new AddressDTO(
        address.getInternalAdditionalInfo(),
        address.getExternalAdditionalInfo(),
        address.getStreetNumber(),
        address.getStreetName(),
        address.getZipCode(),
        address.getCountry());
  }
}
