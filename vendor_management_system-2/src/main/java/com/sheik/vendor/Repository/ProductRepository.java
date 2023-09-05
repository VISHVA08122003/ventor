package com.sheik.vendor.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.sheik.vendor.model.Payment;
import com.sheik.vendor.model.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

	Payment save(Payment data);

}
