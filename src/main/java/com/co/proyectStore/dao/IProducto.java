
package com.co.proyectStore.dao;

import com.co.proyectStore.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IProducto extends JpaRepository<Producto, Long>{
    
}
