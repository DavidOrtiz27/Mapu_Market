package com.mapu.market.persistence.crud;

import com.mapu.market.persistence.entity.Purchase;
import org.springframework.data.repository.CrudRepository;

public interface PurchaseCrudRepository extends CrudRepository<Purchase, Integer> {
}
