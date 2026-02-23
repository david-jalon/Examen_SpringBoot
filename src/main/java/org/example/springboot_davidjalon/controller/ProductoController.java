package org.example.springboot_davidjalon.controller;

import org.example.springboot_davidjalon.services.ProductoService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/")
class ProductoController {
    private final ProductoService productoService;
    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }



}
