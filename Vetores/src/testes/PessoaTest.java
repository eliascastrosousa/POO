package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import entities.Pessoa;

class PessoaTest {

	@Test
	void inicializa() {
		Pessoa p = new Pessoa("elias", 25, 1.77);
		assertEquals("elias",p.getName());
	}
	
	

	
}
