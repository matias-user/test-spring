package com.platzimarket.persistence.crud;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.platzimarket.persistence.entity.Producto;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer>{
 
    List<Producto> findByIdCategoriaOrderByNombreAsc( int idCategoria );
    Optional< List<Producto> > findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
    
}
