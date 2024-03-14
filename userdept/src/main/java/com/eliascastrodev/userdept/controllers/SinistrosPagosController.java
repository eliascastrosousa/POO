package com.eliascastrodev.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eliascastrodev.userdept.entities.SinistrosPagos;
import com.eliascastrodev.userdept.repositories.SinistrosPagosRepository;

@RestController
@RequestMapping(value = "/sinistros_pagos")
public class SinistrosPagosController {
	
	@Autowired
	private SinistrosPagosRepository repository;
	
	@GetMapping
	public List<SinistrosPagos> findAll(){
		List<SinistrosPagos> result = repository.findAll();
		return result;
	}

}
