package com.educandoweb.course3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course3.entities.Order;



public interface OrderRepository extends JpaRepository<Order, Long>{

}
