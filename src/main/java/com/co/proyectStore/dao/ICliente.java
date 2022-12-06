package com.co.proyectStore.dao;

import com.co.proyectStore.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ICliente extends JpaRepository<Cliente, Long>{
    
}
