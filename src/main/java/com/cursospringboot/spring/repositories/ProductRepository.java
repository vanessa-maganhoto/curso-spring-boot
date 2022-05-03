package com.cursospringboot.spring.repositories;


import com.cursospringboot.spring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
