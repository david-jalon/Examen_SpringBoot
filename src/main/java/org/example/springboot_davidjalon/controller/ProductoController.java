package org.example.springboot_davidjalon.controller;

import org.example.springboot_davidjalon.entities.Producto;
import org.example.springboot_davidjalon.services.ProductoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
@RequestMapping("/api")
class ProductoController {
    private final ProductoService productoService;
    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping("/productos")
    public List<Producto> findAll() {
        return productoService.findAll();
    }

    @GetMapping("/productos/{id}")
    public Producto findById(@PathVariable Long id) {
        return productoService.findById(id);
    }

    @GetMapping("/productos/categoria/{category}")
    public List<Producto> findByCategoria(@PathVariable String category) {
        return productoService.findByCategoria(category);
    }

    @GetMapping("/productos/filtrar/{filtro}")
    public ResponseEntity <List<String>> filtrar(@PathVariable Integer filtro) {

        List<String> nombres = productoService.fitrar(filtro);

        if(nombres.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(nombres);
    }

}
