package org.example.springboot_davidjalon.repository;

import org.example.springboot_davidjalon.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
