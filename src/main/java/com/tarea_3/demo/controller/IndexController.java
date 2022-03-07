
package com.tarea_3.demo.controller;

import com.tarea_3.demo.dao.ProductoDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@Slf4j
public class IndexController {
    
    @Autowired
    private ProductoDao productoDao;
    
    @RequestMapping("/")
    public String Inicio(Model model) {
        log.info("Ahora utilizando la arquitectura de MVC");
        
        var productosDB = productoDao.findAll();
        model.addAttribute("productosDB", productosDB);
        
        return "index";
    }
    
}
