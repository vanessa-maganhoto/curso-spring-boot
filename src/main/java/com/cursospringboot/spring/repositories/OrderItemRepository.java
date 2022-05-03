package com.cursospringboot.spring.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cursospringboot.spring.entities.OrderItem;
import com.cursospringboot.spring.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
