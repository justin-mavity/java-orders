package com.lanbdaschool.orders.repositories;

import com.lanbdaschool.orders.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepository extends CrudRepository<Order, Long> {
}
