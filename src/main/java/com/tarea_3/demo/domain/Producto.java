
package com.tarea_3.demo.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table (name="producto_accesorios")
public class Producto implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    
    private long ID_PRODUCTOS_ACESORIOS;
    private String NOMBRE;
    private String ESTADO;
    private String DESCRIPCION;
    private String PRECIO;

    public Producto() {
    }

    public Producto(long ID_PRODUCTOS_ACESORIOS, String NOMBRE, String ESTADO, String DESCRIPCION, String PRECIO) {
        this.ID_PRODUCTOS_ACESORIOS = ID_PRODUCTOS_ACESORIOS;
        this.NOMBRE = NOMBRE;
        this.ESTADO = ESTADO;
        this.DESCRIPCION = DESCRIPCION;
        this.PRECIO = PRECIO;
    }
    
    
}
