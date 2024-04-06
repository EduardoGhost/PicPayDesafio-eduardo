package org.example.dto;

import org.example.Domain.user.UserType;
import java.math.BigDecimal;

public record UserDTO(String firstName, String secondName, String document, BigDecimal balance,
                      String email, String password, UserType userType) {
}
