package stream2_ex2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class main {

	public static void main(String[] args) {
		
		/* 
		ENUNCIADO:
		
		− Mostre todos os nomes dos clientes separados por tamanho (número de caracteres)
		− Pesquise a letra inicial “A” e agrupe os nomes mostrando true e false, ou seja, 
		liste os valores que atendem ou não a regra de par 
		
		*/
		
		List<String> nomes = new ArrayList();
		
		nomes.add("Paulo");
		nomes.add("Camila");
		nomes.add("Ana Maria");
		nomes.add("Patrick");
		nomes.add("Ana Clara");
		nomes.add("Pedro");
		nomes.add("Alfredo");
		
		System.out.println("Nomes que começam com P): ");
		nomes.stream().filter(e -> e.startsWith("P"))
					.forEach(e -> System.out.println(e));
		
		
		System.out.println("Nome ordenado por quantidade de char: ");
		
		nomes.stream()
					.sorted( (a, b) -> Integer.compare(a.length(), b.length()) )
					.forEach( a -> System.out.println(a));
		
		System.out.println("Pesquise a letra inicial “A” e agrupe os nomes mostrando true e false, ou seja,liste os valores que atendem ou não a regra de par");
	
		System.out.println(nomes.stream().collect(Collectors.groupingBy(a -> a.contains("A"))).toString());
		

		System.out.println(nomes.stream().map(a -> a.toUpperCase())
				.collect(Collectors.groupingBy( a ->    a.length())));
	}

}
