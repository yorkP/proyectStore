
package com.co.proyectStore.service;

import com.co.proyectStore.model.Producto;
import java.util.List;


public interface IProductoSer {
    
    public List<Producto> productos();
    
    public void guardarProducto(Producto p);
    
    public Producto encontrarProducto(Producto p);
    
    public void eliminarProducto(Producto p);
    
    
}
