package fr.espritgospel.server.web.mapper;

import static org.junit.jupiter.api.Assertions.*;

import fr.espritgospel.server.domain.entity.User;
import fr.espritgospel.server.domain.entity.UserRole;
import fr.espritgospel.server.web.dto.UserDTO;
import org.junit.jupiter.api.Test;

class UserMapperTest {
  @Test
  void map_modelToDTO() {
    var user =
        User.builder()
            .id(1L)
            .role(UserRole.REGULAR_USER)
            .email("john.doe@gmail.com")
            .isDisabled(false)
            .phoneNumber("0123456789")
            .build();

    var userDTO = UserMapper.map(user);
    assertEquals(1L, userDTO.id());
    assertEquals(UserRole.REGULAR_USER, userDTO.role());
    assertEquals("john.doe@gmail.com", userDTO.email());
    assertFalse(userDTO.isDisabled());
    assertEquals("0123456789", userDTO.phoneNumber());
  }

  @Test
  void map_DTOToModel() {
    var userDTO = new UserDTO(3L, UserRole.ADMIN, "toto.tata@gmail.com", true, "0987654321");

    var user = UserMapper.map(userDTO);
    assertEquals(3L, user.getId());
    assertEquals(UserRole.ADMIN, user.getRole());
    assertEquals("toto.tata@gmail.com", user.getEmail());
    assertTrue(user.isDisabled());
    assertEquals("0987654321", user.getPhoneNumber());
  }
}
