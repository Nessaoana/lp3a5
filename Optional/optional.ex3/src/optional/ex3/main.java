package optional.ex3;

import java.util.Optional;
import java.util.stream.Stream;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Stream<String> streamNome = Stream.of("Paulo", "Camila", "Ana Maria", "Patrick", "Ana Clara", "Pedro", "Alfredo")
				.filter(e -> e.startsWith("W"));
		
		Optional<String> nome = streamNome.findAny();
		if (nome.isPresent())
			System.out.println("Nome encontrado: " + nome.get());
		else
			System.out.println("Nomes com esta letra não consta na lista");
	}

}
