package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import entities.Funcionario;

class FuncionarioTestes {

	@Test
	void testAcrescimoSalario() {
		Funcionario f = new Funcionario(1001,"Elias",1000.00 );
		
		f.setAcrescimoSalario(20.00);
		
		assertEquals(1200.0, f.getSalario());
		
	}

}
