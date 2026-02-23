package org.example.springboot_davidjalon.services;

import org.example.springboot_davidjalon.entities.Producto;
import org.example.springboot_davidjalon.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {
    ProductoRepository productoRepository;
    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }


    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    public Producto findById(Long id) {
        return productoRepository.findById(id).get();
    }

    public List<Producto> findByCategoria(String category) {
        return productoRepository.findByCategoria(category);
    }

    public List<String> fitrar(Integer filtro) {
        return productoRepository.filtrar(filtro);
    }
}
