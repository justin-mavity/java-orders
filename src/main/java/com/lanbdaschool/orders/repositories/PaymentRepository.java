package com.lanbdaschool.orders.repositories;

import com.lanbdaschool.orders.models.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Long> {
}
