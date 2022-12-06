
package com.co.proyectStore.service;

import com.co.proyectStore.model.Cliente;
import java.util.List;

public interface IClienteSer {
    
    public List<Cliente> clientes();
    
    public void guardarCliente(Cliente c);
    
    public Cliente encontrarCliente(Cliente c);
    
    public void eliminarCliente(Cliente c);
    
}
