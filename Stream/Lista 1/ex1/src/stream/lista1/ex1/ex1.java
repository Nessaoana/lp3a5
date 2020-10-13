package stream.lista1.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		System.out.println("solicite ao usuario a entrada no ultimo numero da lista (stream) (n)");
		
	    Scanner scanner = new Scanner(System.in);
	    int numFinal = scanner.nextInt();
	    
		
		System.out.println("Gere uma lista com n�meros de 1 a n duplicados: ");
		
		List<Integer> lista = new ArrayList<Integer>();
		
		for(int i=1; i<=numFinal;i++) {
			lista.add(i);
			lista.add(i);
		}
		
		System.out.println("Mostre todos os n�meros");
		
		lista.stream()
		.forEach(e -> System.out.println(e));
		
		System.out.println("Mostre todos os n�meros sem repeti��o");
		
		lista.stream()
		.distinct()
		.forEach(e -> System.out.println(e));
		
		System.out.println("Mostre todos os n�meros impares sem repeti��o");
		
		lista.stream()
		.filter( a -> a%2 != 0 )
		.distinct()
		.forEach(e -> System.out.println(e));
		
		System.out.println("Mostre todos os n�meros pares sem repeti��o");
		
		lista.stream()
		.filter( a -> a%2 ==0 )
		.distinct()
		.forEach(e -> System.out.println(e));
		
		System.out.println("Mostre todos os n�meros a partir do 5 algarismo sem repeti��o");
		
		lista.stream()
		.skip(4)
		.distinct()
		.forEach(e -> System.out.println(e));
		
		System.out.println("Mostre todos os n�meros multiplicados por 4");
		
		lista.stream()
		.map( a -> a*4)
		.forEach(e -> System.out.println(e));
	}

}
