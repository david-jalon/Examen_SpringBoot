package org.example.springboot_davidjalon.repository;

import org.example.springboot_davidjalon.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

    @Query("SELECT p.nombre FROM Producto p WHERE p.categoria = :category")
    List<Producto> findByCategoria(@Param("category") String category);

    @Query("SELECT p.nombre FROM Producto p WHERE p.stock >= :filtro")
    List<String> filtrar(@Param("filtro") Integer filtro);
}
