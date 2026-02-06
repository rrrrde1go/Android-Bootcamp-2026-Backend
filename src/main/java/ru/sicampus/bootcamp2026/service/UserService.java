
package ru.sicampus.bootcamp2026.service;

import ru.sicampus.bootcamp2026.dto.UserDTO;
import ru.sicampus.bootcamp2026.dto.UserRegistrationDTO;
import java.util.List;

public interface UserService {
    List<UserDTO> getAllUsers();
    UserDTO getUserById(Long id);
    UserDTO createUser(UserDTO dto);
    UserDTO updateUser(Long id, UserDTO dto);
    void deleteUser(Long id);

    // регистрация отдельным методом
    UserDTO registerUser(UserRegistrationDTO dto);
}
