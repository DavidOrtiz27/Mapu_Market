package com.mapu.market.persistence.crud;

import com.mapu.market.persistence.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductCrudRepository extends CrudRepository<Product, Integer> {
}
