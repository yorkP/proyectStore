
package com.co.proyectStore.dao;

import com.co.proyectStore.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IEmpleado extends JpaRepository<Empleado, Long>{
    
}
