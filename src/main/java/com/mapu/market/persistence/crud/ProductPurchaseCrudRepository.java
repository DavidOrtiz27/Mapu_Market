package com.mapu.market.persistence.crud;

import com.mapu.market.persistence.entity.ProductPurchase;
import com.mapu.market.persistence.entity.ProductPurchasePK;
import org.springframework.data.repository.CrudRepository;

public interface ProductPurchaseCrudRepository extends CrudRepository<ProductPurchase, ProductPurchasePK> {
}
