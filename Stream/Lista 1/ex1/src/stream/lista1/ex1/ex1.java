package stream.lista1.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		System.out.println("solicite ao usuario a entrada no ultimo numero da lista (stream) (n)");
		
	    Scanner scanner = new Scanner(System.in);
	    int numFinal = scanner.nextInt();
	    
		
		System.out.println("Gere uma lista com números de 1 a n duplicados: ");
		
		List<Integer> lista = new ArrayList<Integer>();
		
		for(int i=1; i<=numFinal;i++) {
			lista.add(i);
			lista.add(i);
		}
		
		System.out.println("Mostre todos os números");
		
		lista.stream()
		.forEach(e -> System.out.println(e));
		
		System.out.println("Mostre todos os números sem repetição");
		
		lista.stream()
		.distinct()
		.forEach(e -> System.out.println(e));
		
		System.out.println("Mostre todos os números impares sem repetição");
		
		lista.stream()
		.filter( a -> a%2 != 0 )
		.distinct()
		.forEach(e -> System.out.println(e));
		
		System.out.println("Mostre todos os números pares sem repetição");
		
		lista.stream()
		.filter( a -> a%2 ==0 )
		.distinct()
		.forEach(e -> System.out.println(e));
		
		System.out.println("Mostre todos os números a partir do 5 algarismo sem repetição");
		
		lista.stream()
		.skip(4)
		.distinct()
		.forEach(e -> System.out.println(e));
		
		System.out.println("Mostre todos os números multiplicados por 4");
		
		lista.stream()
		.map( a -> a*4)
		.forEach(e -> System.out.println(e));
	}

}
