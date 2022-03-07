
package com.tarea_3.demo.dao;

import com.tarea_3.demo.domain.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoDao extends CrudRepository<Producto,Long>{
    
}
