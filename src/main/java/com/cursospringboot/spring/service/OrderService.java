package com.cursospringboot.spring.service;

import com.cursospringboot.spring.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cursospringboot.spring.repositories.OrderRepository;


import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
                //orElseThrow(() -> new ResourceNotFoundException(id));
    }
}
