package fr.espritgospel.server.web.dto;

import java.time.ZonedDateTime;

/**
 * Representation of a concert as it exposed through the api.
 *
 * @param id id of the concert
 * @param address address
 * @param date date
 * @param description description
 */
public record ConcertDTO(long id, AddressDTO address, ZonedDateTime date, String description) {}
