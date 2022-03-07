
package com.tarea_3.demo.service;

import com.tarea_3.demo.dao.ProductoDao;
import com.tarea_3.demo.domain.Producto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoDao productoDao;
    
    @Override
    @Transactional (readOnly = true)
    public List<Producto> getProducto() {
        return (List<Producto>)productoDao.findAll();
    }

    @Override
    @Transactional
    public void save(Producto producto) {
        productoDao.save(producto);
    }

    @Override
    @Transactional
    public void delete(Producto producto) {
        productoDao.delete(producto);
    }

    @Override
    @Transactional (readOnly = true)
    public Producto getProducto(Producto producto) {
        return productoDao.findById(producto.getID_PRODUCTOS_ACESORIOS()).orElse(null);
    }
    
}
