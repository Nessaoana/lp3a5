package reduce.ex2;

import java.util.Arrays;
import java.util.List;

public class ex2 {

	public static void main(String[] args) {
		// Exercício 2
		
		List<String> nomes = Arrays
                .asList("Paulo", "Camila", "Ana Maria", "Patrick", "Ana Clara", "Pedro", "Alfredo");

        System.out.println("Nomes que começam com P: " + nomes
                .stream()
                .filter(s -> s.startsWith("P"))
                .reduce("", (a, b) -> a + b));

        System.out.println("Nome que começam com A: " + nomes
                .stream()
                .filter(s -> s.startsWith("A"))
                .reduce("", (a, b) -> a + b));

        System.out.println("Todos nomes concatenados: " + nomes
                .stream()
                .reduce("", (a, b) -> a + b));

	}

}
