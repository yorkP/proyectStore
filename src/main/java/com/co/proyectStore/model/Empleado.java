
package com.co.proyectStore.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "empleado")
public class Empleado implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado")
    private Long idEmpleado;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "cedula")
    private int cedula;
    
    @Column(name = "telefono")
    private int telefono;
    
    @Column(name = "email")
    private String email;
    
    
    
}
