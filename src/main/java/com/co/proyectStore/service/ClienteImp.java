
package com.co.proyectStore.service;

import com.co.proyectStore.dao.ICliente;
import com.co.proyectStore.model.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteImp implements IClienteSer{
    
    @Autowired
    private ICliente cliente;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> clientes() {
        return cliente.findAll();
    }

    @Override
    @Transactional
    public void guardarCliente(Cliente c) {
         cliente.save(c);
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente encontrarCliente(Cliente c) {
        return cliente.findById(c.getIdCliente()).orElse(null);
    }

    @Override
    @Transactional
    public void eliminarCliente(Cliente c) {
        cliente.delete(c);
    }
    
}
