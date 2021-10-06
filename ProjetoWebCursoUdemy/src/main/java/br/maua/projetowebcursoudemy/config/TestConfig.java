package br.maua.projetowebcursoudemy.config;

import br.maua.projetowebcursoudemy.entities.User;
import br.maua.projetowebcursoudemy.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{


    @Autowired
    private UserRepositories userRepositories;

    @Override
    public void run(String... args) throws Exception{
        User user1 = new User(null, "Lucas Duez", "lucas@gmail", "9999", "1234");
        User user2 = new User(null, "Laura Duez", "laura@gmail", "8888", "4321");

        userRepositories.saveAll(Arrays.asList(user1, user2));
    }
}
