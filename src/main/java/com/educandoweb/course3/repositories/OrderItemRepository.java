package com.educandoweb.course3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course3.entities.OrderItem;



public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{



}
