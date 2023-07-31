package com.vanthuan0504.orderservice.repository;

import com.vanthuan0504.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
