
package com.co.proyectStore.service;

import com.co.proyectStore.dao.IEmpleado;
import com.co.proyectStore.model.Empleado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmpleadoImp implements IEmpleadoSer{

    @Autowired
    private IEmpleado empleado;
    
    @Override
    @Transactional(readOnly = true)
    public List<Empleado> empleados() {
        return empleado.findAll();
    }

    @Override
    @Transactional
    public void guardarEmpleado(Empleado e) {
        empleado.save(e);
    }

    @Override
    @Transactional(readOnly = true)
    public Empleado encontrarEmpleado(Empleado e) {
        return empleado.findById(e.getIdEmpleado()).orElse(null);
    }

    @Override
    @Transactional
    public void eliminarEmpleado(Empleado e) {
        empleado.delete(e);
    }
    
}
