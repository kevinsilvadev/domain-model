package com.kevinjava.domain.repositories;

import com.kevinjava.domain.enities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
