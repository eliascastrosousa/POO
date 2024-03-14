package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat fmt1 = new SimpleDateFormat("dd/MM/yyyy");
		
		String nameDepartment;
		String name;
		String level;
		Double baseSalary;
		int n_contracts = 0;
		
		System.out.println("Entre com o nome do departmento: ");
		nameDepartment = sc.nextLine();
		
		Department department = new Department(nameDepartment);
		
		System.out.println("Entre com os dados do funcionario: ");
		System.out.println("Name: ");
		name = sc.nextLine();
		System.out.println("Level: ");
		level = sc.nextLine();
		System.out.println("Base Salary: ");
		baseSalary = sc.nextDouble();
		
		Worker funcionario = new Worker(name, WorkerLevel.valueOf(level), baseSalary, department);
		
		System.out.println("Quantos contratos irão entrar? ");
		n_contracts = sc.nextInt();
		
		for (int i = 1; i <= n_contracts; i++) {
			System.out.println("Entre com o contrato num "+i);
			System.out.println("Date (DD/MM/YYYY): ");
			Date d08 = fmt1.parse(sc.next());
			
			System.out.println("Valor por hora: ");
			double valueHour = sc.nextDouble();
			System.out.println("Duração (horas): ");
			int hour = sc.nextInt();
			
			HourContract contrato = new HourContract(d08, valueHour, hour);
			funcionario.addContract(contrato);
		}
		
		System.out.println("Entre com o mês e o ano que deseja calcular os ganhos (MM/YYYY) ex: 02/2023");
		String mesAno = sc.next();
		int mes = Integer.parseInt(mesAno.substring(0,2));
		int ano = Integer.parseInt(mesAno.substring(3));
		
		System.out.println("==================================\n");
		System.out.println("Nome: " + funcionario.getName());
		System.out.println("Departamento: " + funcionario.getDepartment().getName());
		System.out.println("Ganhos em " + mesAno + ": ");
		
		System.out.println(funcionario.income(mes, ano));
		
		
		
		 

		
		
		
		
		
		sc.close();
	}

}
