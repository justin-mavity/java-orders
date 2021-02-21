package com.lanbdaschool.orders.repositories;

import com.lanbdaschool.orders.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomersRepository extends CrudRepository<Customer, Long> {
}
