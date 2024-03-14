package testes;
import static org.junit.jupiter.api.Assertions.*;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

class WorkerTestes {
	private Worker funcionario;
	private HourContract contrato;
	private SimpleDateFormat fmt1 = new SimpleDateFormat("dd/MM/yyyy");

	@BeforeEach
	public void inicializaWorker() {
		Department department = new Department("Design");
		String name = "alex";
		String level = "MID_LEVEL";
		double baseSalary = 1200;
		funcionario = new Worker(name, WorkerLevel.valueOf(level), baseSalary, department);
		
	}
	
	@BeforeEach
	public void adicionaContrato() throws ParseException {
		Date d08 = fmt1.parse("20/08/2023");
		int horas = 20;
		double valor = 80;
		contrato = new HourContract(d08, valor, horas);
		funcionario.addContract(contrato);
	}
	
	@Test
	void testToString() {
		System.out.println(funcionario);
	}
	
	@Test
	public void TestValoresRecebidos() {		
		assertEquals(2800, funcionario.totalValues());
	}
	
	@Test
	public void TestRecebidoporMes() throws ParseException {
		Date d08 = fmt1.parse("25/08/2023");
		int horas = 10;
		double valor = 120;
		contrato = new HourContract(d08, valor, horas);
		funcionario.addContract(contrato);
		
		assertEquals(4000, funcionario.income(8, 2023));
	}

}
