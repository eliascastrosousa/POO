package com.eliascastrodev.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eliascastrodev.userdept.entities.Loja;
import com.eliascastrodev.userdept.repositories.LojaRepository;

@RestController
@RequestMapping(value = "/loja")
public class LojaController {
	
	@Autowired
	private LojaRepository repository;
	
	@GetMapping
	public List<Loja> findAll(){
		List<Loja> result = repository.findAll();
		return result;
	}

}
