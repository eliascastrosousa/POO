import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

public class Funcionarios {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>(); // lista do tipo objeto funcionario
		
		int n;
		Integer id;
		String nome;
		Double salario;
		
		
		System.out.println("Digite a quantidade de funcionarios para entrar: ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Funcionario #%d\n",i+1);
			System.out.println("Digite o ID: ");
			id = sc.nextInt();
			
			System.out.println("Digite o nome: ");
			nome = sc.next();
			
			System.out.println("Digite o salario: ");
			salario = sc.nextDouble();
			
			Funcionario f = new Funcionario(id, nome, salario);
			list.add(f); // adcionando o objeto a lista
			
		}
		
		System.out.println("\nFuncionarios");
		for (Funcionario funcionario : list) {
			System.out.println(funcionario);
		}
		
		
		System.out.println("\nDigite o Id do funcionario que tera um acrescimo de salario: ");
		int idAcrescimo = sc.nextInt();
		
		Integer index = buscaId(list, idAcrescimo);
		
		if (index == null) {
			System.out.println("id nao encontrado");
		}else {
			System.out.println("Entre com a porcentagem: ");
			Double percent = sc.nextDouble();
			
			list.get(index).setAcrescimoSalario(percent);
		}
		
		System.out.println("\nFuncionarios atualizado");
		for (Funcionario funcionario : list) {
			System.out.println(funcionario);
		}
				
		sc.close();
	
	}
	
	public static Integer buscaId(List<Funcionario> busca, int id) {
		for (int i = 0; i < busca.size(); i++) {
			if (busca.get(i).getId() == id) {
				return i; 
			}
		}
		return null;
	}
	
	
}
	
		

