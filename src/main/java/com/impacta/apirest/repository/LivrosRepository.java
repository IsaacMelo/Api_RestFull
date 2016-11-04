package com.impacta.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.impacta.apirest.domain.Livro;

public interface LivrosRepository extends JpaRepository<Livro , Long>{

}
