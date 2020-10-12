package stream2_ex1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class gerarListas {

	public static void main(String[] args) {
		
		gerarLista100();
		gerarLista10();
				
	}
	
	public static void gerarLista100() {
		
		// ENUNCIADO:
		// Gere uma lista com 100 números aleatórios e mostre estes número
		
		System.out.println("Lista de 100 numeros aleatorios");
		
		List<Integer> lista = new ArrayList();
		
		for(int i=0; i<100;i++) {
			lista.add( new Random().nextInt());
		}
		
		lista.stream()
			.forEach(e -> System.out.println(e));
	}
	
	public static void gerarLista10() {
		
		// ENUNCIADO:
		// Gere uma lista com 10 números quaisquer
		// - Mostre o maior número
		// - Mostre o menor número
		// - Mostre a quantidade de números
		
		
		System.out.println("Lista de 10 numeros aleatorios");
		
		List<Integer> lista10 = new ArrayList();
		
		// carregando a lista
		for(int i=0; i<10;i++) {
			lista10.add( new Random().nextInt());
		}
		
		System.out.println("Quantidade de números: " + lista10.stream().count() );
		System.out.println("Número máximo: " + lista10.stream().max(Comparator.naturalOrder()) );
		System.out.println("Número mínimo: " + lista10.stream().min(Comparator.naturalOrder()) );
	}

}
