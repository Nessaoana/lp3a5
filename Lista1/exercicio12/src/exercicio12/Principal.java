package exercicio12;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite X: ");
		int x = ler.nextInt();
		System.out.println("Digite Y: ");
		int z = ler.nextInt();
		
		while(z<x) {
			System.out.println("Digite um número maior que x (" + x +")");
			z = ler.nextInt();
		}
		
		ContarInteiros ci = new ContarInteiros(x, z);
		
		Thread tr = new Thread(ci);
		
		tr.run();
		
		System.out.println("Inteiros de " + x + " ate " +z + ": " + ci.getInteiros());
		
	}

}
