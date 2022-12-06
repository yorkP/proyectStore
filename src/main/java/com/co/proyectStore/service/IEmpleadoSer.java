
package com.co.proyectStore.service;

import com.co.proyectStore.model.Empleado;
import java.util.List;

public interface IEmpleadoSer {

    public List<Empleado> empleados();
    
    public void guardarEmpleado(Empleado e);
    
    public Empleado encontrarEmpleado(Empleado e);
    
    public void eliminarEmpleado(Empleado e );
    
}
