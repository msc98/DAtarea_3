
package com.tarea_3.demo.service;

import com.tarea_3.demo.domain.Producto;
import java.util.List;

public interface ProductoService {
    
    public List<Producto> getProducto();
    
    public void save(Producto producto);
    
    public void delete(Producto producto);
    
    public Producto getProducto(Producto producto);
}
