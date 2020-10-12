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
		// Gere uma lista com 100 n�meros aleat�rios e mostre estes n�mero
		
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
		// Gere uma lista com 10 n�meros quaisquer
		// - Mostre o maior n�mero
		// - Mostre o menor n�mero
		// - Mostre a quantidade de n�meros
		
		
		System.out.println("Lista de 10 numeros aleatorios");
		
		List<Integer> lista10 = new ArrayList();
		
		// carregando a lista
		for(int i=0; i<10;i++) {
			lista10.add( new Random().nextInt());
		}
		
		System.out.println("Quantidade de n�meros: " + lista10.stream().count() );
		System.out.println("N�mero m�ximo: " + lista10.stream().max(Comparator.naturalOrder()) );
		System.out.println("N�mero m�nimo: " + lista10.stream().min(Comparator.naturalOrder()) );
	}

}
