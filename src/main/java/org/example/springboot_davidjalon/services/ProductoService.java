package org.example.springboot_davidjalon.services;

import org.example.springboot_davidjalon.repository.ProductoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {
    ProductoRepository ProductoRepository;
    public ProductoService(ProductoRepository productoRepository) {
        this.ProductoRepository = productoRepository;
    }

}
