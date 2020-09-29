package optional.ex2;

import java.util.Optional;

public class main {

	public static void main(String[] args) throws Exception {
		
		Optional<String> varVazio = Optional.empty();
		Optional<String> varValor = Optional.of("Eu sou uma vari�vel com valor");
		
		
//		- Usar  orElseThrow  para mostrar conte�do da vari�vel n�o vazia

		System.out.println(varValor.orElseThrow(() -> new Exception("Vari�vel vazia usando .orElseGet")));

//		- Usar  orElseThrow  para lan�ar a exce��o no caso da vari�vel vazia

		System.out.println(varVazio.orElseThrow(() -> new Exception("Vari�vel vazia usando .orElseGet")));	
		
	}

}
