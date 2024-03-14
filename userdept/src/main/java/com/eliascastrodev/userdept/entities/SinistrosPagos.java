package com.eliascastrodev.userdept.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_sinistrospagos")

public class SinistrosPagos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String entCodigo;
	private String entNome;
	private String cnpj;
	private String ramo;
	private String mesocorrencia;
	private String mesaviso;
	private String mespagamento;
	private Double valor;
	private String tipopagamento;
	
	public SinistrosPagos() {
		super();
	}
	
	
	
	
	
}
