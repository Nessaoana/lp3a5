package optional.ex4;

import java.util.Optional;
import java.util.stream.Stream;

public class main {

	public static void main(String[] args) throws Exception {
		
		Stream<String> streamNome = Stream.of("Paulo", "Camila", "Ana Maria", "Patrick", "Ana Clara", "Pedro", "Alfredo")
				.filter(e -> e.startsWith("W"));
		
		Optional<String> nome = streamNome.findAny();
		
		System.out.println(nome.orElseThrow(() -> new Exception("Nomes com esta letra não consta na lista")));
		
	}

}
