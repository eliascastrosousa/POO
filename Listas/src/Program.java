import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("joao");
		list.add("marcos");
		list.add("jose");
		
		System.out.println("\n--------------\nElementos\n");
		for (String lista : list) {
			System.out.println(lista);
		}
		
		System.out.println("\n--------------\nAdicionando elemento sem index\n");
		list.add("matheus");
		for (String lista : list) {
			System.out.println(lista);
		}
		
		System.out.println("\n--------------\nAdicionando elemento com index\n");
		list.add(0,"abigail");
		for (String lista : list) {
			System.out.println(lista);
		}
		
		System.out.println("\n--------------\nTamanho elementos\n");
		System.out.println(list.size());
		
		System.out.println("\n--------------\nRemovendo elemento de index 1\n");
		list.remove(1); //pelo index
		for (String lista : list) {
			System.out.println(lista);
		}
		
		System.out.println("\n--------------\nRemovendo elemento por predicado \n");
		list.removeIf(x -> x.charAt(0)=='m'); // funcao lambda diferencia de maiusculo e minusculo
		
		for (String lista : list) {
			System.out.println(lista);
		}
		
		System.out.println("\n--------------\nProcurar por index \n");
		System.out.println("Index de joao: " + list.indexOf("joao"));
		
		System.out.println("\n--------------\nProcurar por index nao existente \n");
		System.out.println("Index de maria: " + list.indexOf("maria"));
		
		System.out.println("\n--------------\nFiltrar nomes por index de inicial \n");
		
		List<String> result = list.stream().filter(x -> x.charAt(0)=='a').collect(Collectors.toList());
		
		for (String resultado : result) {
			System.out.println(resultado);
		}
		
		System.out.println("\n--------------\nEncontrar o primeiro nome com a inicial a \n");
		
		String primeironome = list.stream().filter(x -> x.charAt(0)=='a').findFirst().orElse(null);
		System.out.println(primeironome);
		
		String primeironome2 = list.stream().filter(x -> x.charAt(0)=='r').findFirst().orElse(null); //nao tem
		System.out.println(primeironome2);
		
	}

}
