package org.example.Domain.user;

import jakarta.persistence.*;
import lombok.*;
import org.example.dto.UserDTO;
import java.math.BigDecimal;

@Entity(name = "users")
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String secondName;

    @Column(unique = true)
    private String document;

    @Column(unique = true)
    private String email;

    private String password;
    private BigDecimal balance;

    @Enumerated(EnumType.STRING)
    private UserType userType;

    public User(UserDTO data){
        this.firstName = data.firstName();
        this.secondName = data.secondName();
        this.document = data.document();
        this.email = data.email();
        this.balance = data.balance();
        this.password = data.password();
        this.userType = data.userType();
    }


}