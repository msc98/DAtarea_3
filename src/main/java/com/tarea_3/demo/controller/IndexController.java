package com.tarea_3.demo.controller;

import com.tarea_3.demo.domain.Producto;
import com.tarea_3.demo.service.ProductoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class IndexController {

    @Autowired
    private ProductoService productoService;

    @RequestMapping("/")
    public String Inicio(Model model) {
        log.info("Ahora utilizando la arquitectura de MVC");

        return "index";
    }

    @GetMapping("/listar")
    public String listar(Producto producto, Model model) {
        var productosDB = productoService.getProducto();
        model.addAttribute("productosDB", productosDB);
        return "listar.html";
    }

    @PostMapping("/guardarProducto")
    public String guardarProducto(Producto producto, Model model) {
        var productosDB = productoService.getProducto();
        model.addAttribute("productosDB", productosDB);
        productoService.save(producto);
        return "listar.html";
    }

    @GetMapping("/modificarProducto/{ID_PRODUCTOS_ACESORIOS}")
    public String modificarProducto(Producto producto, Model model) {
        Producto respuesta = productoService.getProducto(producto);
        model.addAttribute("Producto", respuesta);
        return "modificarProducto";
    }

    @GetMapping("/eliminarProducto/{ID_PRODUCTOS_ACESORIOS}")
    public String eliminarProducto(Producto producto, Model model) {
        var productosDB = productoService.getProducto();
        model.addAttribute("productosDB", productosDB);
        productoService.delete(producto);
        return "listar.html";
    }

    @GetMapping("/insertar")
    public String insertar(Producto producto) {
        return "insertar.html";
    }

    @GetMapping("/contacto")
    public String contacto(Producto producto) {
        return "contacto.html";
    }
}
