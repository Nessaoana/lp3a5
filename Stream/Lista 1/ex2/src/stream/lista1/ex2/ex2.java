package stream.lista1.ex2;

import java.util.Arrays;
import java.util.List;

public class ex2 {

	public static void main(String[] args) {

		System.out.println("Crie um Stream contendo todos os números de 0 a 9");
		
		List<Integer> lista = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9 );
		
		
		System.out.println("Aplique um filtro mantendo apenas os números pares");
		
		lista.stream()
		.filter( a -> a%2 == 0 )
		.forEach(e -> System.out.println(e));
		
		System.out.println("Ignores os dois primeiros números");
		
		lista.stream()
		.skip(2)
		.forEach(e -> System.out.println(e));
		
		System.out.println("Limite o processamento aos dois primeiros números");
		
		lista.stream()
		.limit(2)
		.forEach(e -> System.out.println(e));
		
		System.out.println("Aplique uma multiplicação por 2 em cada elemento");
		
		lista.stream()
		.map( a -> a*2)
		.forEach(e -> System.out.println(e));
		
		System.out.println("Mostre o resultado final");
		
		lista.stream()
		.filter( a -> a%2 == 0 )
		.skip(2)
		.limit(2)
		.map( a -> a*2)
		.forEach(e -> System.out.println(e));
		
		
	}

}
