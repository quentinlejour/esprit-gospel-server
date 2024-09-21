package fr.espritgospel.server.web.dto;

import fr.espritgospel.server.domain.entity.UserRole;

public record UserDTO(
    Long id, UserRole role, String email, boolean isDisabled, String phoneNumber) {}
