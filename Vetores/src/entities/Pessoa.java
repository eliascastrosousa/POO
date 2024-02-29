package entities;

public class Pessoa {
	
	String name; 
	int idade; 
	double altura;

	public Pessoa(String name, int idade, double altura) {
		this.name = name;
		this.idade = idade;
		this.altura = altura;
	}
	
	public Pessoa(String name, int idade) {
		this.name = name;
		this.idade = idade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	
	
}
