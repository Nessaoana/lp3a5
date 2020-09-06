package exercicio12;

import java.util.Scanner;



public class ContarInteiros {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite X: ");
		int num1 = ler.nextInt();
		System.out.println("Digite Y: ");
		int num2 = ler.nextInt();
		
		while(num2<num1) {
			System.out.println("Digite um número maior que x (" + num1 +")");
			num2 = ler.nextInt();
		}
		
		final int numero2 = num2;
		
		new Thread( () -> {
			int inteiros = numero2 - num1;
			
			System.out.println("Inteiros de " + num1 + " ate " +numero2 + ": " + inteiros);
			
		}).run();
		
		
	}
}