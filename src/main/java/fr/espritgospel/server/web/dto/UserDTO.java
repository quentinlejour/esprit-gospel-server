package fr.espritgospel.server.web.dto;

import fr.espritgospel.server.domain.entity.UserRole;

/**
 * Representation of a user as it is exposed through the api.
 *
 * @param id id of the user
 * @param role role of the user (regular member, admin etc.)
 * @param email email
 * @param isDisabled whether the user is active or not
 * @param phoneNumber user phone number
 */
public record UserDTO(
    long id, UserRole role, String email, boolean isDisabled, String phoneNumber) {}
