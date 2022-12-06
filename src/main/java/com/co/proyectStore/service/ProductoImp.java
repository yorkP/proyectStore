
package com.co.proyectStore.service;

import com.co.proyectStore.dao.IProducto;
import com.co.proyectStore.model.Producto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductoImp implements IProductoSer{
    
    @Autowired
    private IProducto producto;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> productos() {
        return producto.findAll();
    }

    @Override
    @Transactional
    public void guardarProducto(Producto p) {
        producto.save(p);
    }

    @Override
    @Transactional(readOnly = true)
    public Producto encontrarProducto(Producto p) {
        return producto.findById(p.getId()).orElse(null);
    }

    @Override
    @Transactional
    public void eliminarProducto(Producto p) {
        producto.delete(p);
    }
    
}
