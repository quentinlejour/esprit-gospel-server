package fr.espritgospel.server.web.dto;

/**
 * Representation of an address as it exposed through the api.
 *
 * @param internalAdditionalInfo internal additional info (e.g. 2nd floor)
 * @param externalAdditionalInfo external additional info (e.g. church)
 * @param streetNumber street number
 * @param streetName street name
 * @param zipCode zip code
 * @param country country
 */
public record AddressDTO(
    String internalAdditionalInfo,
    String externalAdditionalInfo,
    int streetNumber,
    String streetName,
    String zipCode,
    String country) {}
