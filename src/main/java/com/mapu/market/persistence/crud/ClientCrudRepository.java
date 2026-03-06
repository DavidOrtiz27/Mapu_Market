package com.mapu.market.persistence.crud;

import com.mapu.market.persistence.entity.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientCrudRepository extends CrudRepository<Client, String> {
}
