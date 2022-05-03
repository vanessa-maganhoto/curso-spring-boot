package com.cursospringboot.spring.repositories;

import com.cursospringboot.spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
