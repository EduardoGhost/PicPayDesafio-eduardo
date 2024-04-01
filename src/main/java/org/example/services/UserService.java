package org.example.services;

import org.example.Domain.user.User;
import org.example.Domain.user.UserType;
import org.example.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigDecimal;

public class UserService {

    @Autowired
    private UserRepository userRepository;

    //criar classe para essa exceção
    public void validateTransaction(User sender, BigDecimal amount) throws Exception{
        if(sender.getUserType() == UserType.MERCHANT){
            throw new Exception("Usuário sem autorização");
        }
        if(sender.getBalance().compareTo(amount) < 0){
            throw new Exception("Saldo insuficiente");
        }

    }

    public User findUserById(Long id) throws Exception{
        return this.userRepository.findUserById(id).orElseThrow(() -> new Exception("Usuario não encontrado"));
    }

    public void saveUser(User user){
        this.userRepository.save(user);
    }
}
