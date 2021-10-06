package br.maua.projetowebcursoudemy.services;

import br.maua.projetowebcursoudemy.entities.User;
import br.maua.projetowebcursoudemy.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService{
    @Autowired
    private UserRepositories userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }
}
