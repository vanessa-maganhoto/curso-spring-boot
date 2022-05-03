package com.cursospringboot.spring.repositories;

import com.cursospringboot.spring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
