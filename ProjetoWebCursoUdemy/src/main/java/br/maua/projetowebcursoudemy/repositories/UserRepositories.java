package br.maua.projetowebcursoudemy.repositories;

import br.maua.projetowebcursoudemy.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositories extends JpaRepository<User, Integer>{



}
