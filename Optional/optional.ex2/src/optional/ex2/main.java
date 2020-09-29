package optional.ex2;

import java.util.Optional;

public class main {

	public static void main(String[] args) throws Exception {
		
		Optional<String> varVazio = Optional.empty();
		Optional<String> varValor = Optional.of("Eu sou uma variável com valor");
		
		
//		- Usar  orElseThrow  para mostrar conteúdo da variável não vazia

		System.out.println(varValor.orElseThrow(() -> new Exception("Variável vazia usando .orElseGet")));

//		- Usar  orElseThrow  para lançar a exceção no caso da variável vazia

		System.out.println(varVazio.orElseThrow(() -> new Exception("Variável vazia usando .orElseGet")));	
		
	}

}
