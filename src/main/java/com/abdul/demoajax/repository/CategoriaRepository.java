package com.abdul.demoajax.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abdul.demoajax.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
