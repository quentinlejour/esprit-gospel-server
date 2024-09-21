package fr.espritgospel.server.web.mapper;

import fr.espritgospel.server.domain.entity.User;
import fr.espritgospel.server.web.dto.UserDTO;
import javax.annotation.Nonnull;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UserMapper {

  /**
   * Creates a new instance of {@link User} from a {@link UserDTO}.
   *
   * @param userDTO the {@link UserDTO} to map the {@link User} with.
   * @return a new {@link User} instance created from a {@link UserDTO}.
   */
  @Nonnull
  public User map(@Nonnull UserDTO userDTO) {
    return User.builder()
        .id(userDTO.id())
        .role(userDTO.role())
        .email(userDTO.email())
        .isDisabled(userDTO.isDisabled())
        .phoneNumber(userDTO.phoneNumber())
        .build();
  }

  /**
   * Creates a new instance of {@link UserDTO} from a {@link User}.
   *
   * @param user the {@link User} to map the {@link UserDTO } with.
   * @return a new {@link UserDTO} instance created from a {@link User}.
   */
  @Nonnull
  public UserDTO map(@Nonnull User user) {
    return new UserDTO(
        user.getId(), user.getRole(), user.getEmail(), user.isDisabled(), user.getPhoneNumber());
  }
}
