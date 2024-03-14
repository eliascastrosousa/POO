package com.eliascastrodev.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eliascastrodev.userdept.entities.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos, Long>{

}
