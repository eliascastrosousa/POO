package com.eliascastrodev.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eliascastrodev.userdept.entities.Produtos;
import com.eliascastrodev.userdept.repositories.ProdutosRepository;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutosController {

	@Autowired
	private ProdutosRepository repository;
	
	@GetMapping
	public List<Produtos> findAll(){
		List<Produtos> result = repository.findAll();
		return result;
	}
}
