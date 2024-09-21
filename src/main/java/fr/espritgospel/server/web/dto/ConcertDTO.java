package fr.espritgospel.server.web.dto;

import fr.espritgospel.server.domain.entity.Address;
import java.time.ZonedDateTime;

public record ConcertDTO(Long id, Address address, ZonedDateTime date, String description) {}
