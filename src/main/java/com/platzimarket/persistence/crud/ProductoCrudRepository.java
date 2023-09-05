package com.platzimarket.persistence.crud;

import org.springframework.data.repository.CrudRepository;

import com.platzimarket.persistence.entity.Producto;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer>{
    
}
