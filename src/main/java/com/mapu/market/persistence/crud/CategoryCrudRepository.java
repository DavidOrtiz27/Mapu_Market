package com.mapu.market.persistence.crud;

import com.mapu.market.persistence.entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryCrudRepository extends CrudRepository<Category, Integer> {
}
