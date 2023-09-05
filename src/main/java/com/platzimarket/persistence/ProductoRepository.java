package com.platzimarket.persistence;

import java.util.List;

import com.platzimarket.persistence.crud.ProductoCrudRepository;
import com.platzimarket.persistence.entity.Producto;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        
        return (List<Producto>) productoCrudRepository.findAll();
    }    
}
