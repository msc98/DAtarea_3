
package com.tarea_3.demo.controller;

import com.tarea_3.demo.domain.Producto;
import com.tarea_3.demo.service.ProductoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@Slf4j
public class IndexController {
    
    @Autowired
    private ProductoService productoService;
    
    @RequestMapping("/")
    public String Inicio(Model model) {
        log.info("Ahora utilizando la arquitectura de MVC");
        
        var productosDB = productoService.getProducto();
        model.addAttribute("productosDB", productosDB);
        
        return "index";
    }
    
    @GetMapping("/listar")
    public String listar(Producto producto){
        return "listar.html";
    }
    
}
