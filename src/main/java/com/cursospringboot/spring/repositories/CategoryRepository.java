package com.cursospringboot.spring.repositories;

import com.cursospringboot.spring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
