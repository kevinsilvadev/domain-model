package com.kevinjava.domain.repositories;

import com.kevinjava.domain.enities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
