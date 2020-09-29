package optional;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		
		
		Optional<String> varVazio = Optional.empty();
		Optional<String> varValor = Optional.of("Eu sou uma vari�vel com valor");
		
//	Para optional vazio implemente:
//		- Teste: se o optional vazio obter a string usando orElse

		System.out.println(varVazio.orElse("Vari�vel vazia usando .orElse"));
		
		
//		- Teste: se o optional a vazio obter a string usando orElseGet

		System.out.println(varVazio.orElseGet(() -> "Vari�vel vazia usando .orElseGet"));

		

//	 Para optional com valor implemente:
//		- Teste: se o optional vazio obter a string usando orElse
		
		System.out.println(varValor.orElse("Vari�vel vazia usando .orElse"));
		
		
//		- Teste: se o optional a vazio obter a string usando orElseGet

		System.out.println(varValor.orElseGet(() -> "Vari�vel vazia usando .orElseGet"));
		
	
		

	}

}
