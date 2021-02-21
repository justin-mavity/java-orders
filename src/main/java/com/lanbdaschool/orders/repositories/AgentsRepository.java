package com.lanbdaschool.orders.repositories;

import com.lanbdaschool.orders.models.Agent;
import org.springframework.data.repository.CrudRepository;

public interface AgentsRepository extends CrudRepository<Agent, Long> {

}
