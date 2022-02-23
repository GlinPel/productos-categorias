package com.gleenpeltroche.productocategorias.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import com.gleenpeltroche.productocategorias.models.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
	List<Product> findAll();
    Optional<Product> findById(Long id);
}
