package reduce.ex1;

import java.math.BigInteger;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ex1 {

	public static void main(String[] args) {
        // Exerc�cio 1 

        Supplier<IntStream> numbers = () -> new Random().ints(100, 1, 100);

        System.out.println("Soma dos itens " + numbers.get().reduce(0,  Integer::sum));

        System.out.println("Multiplica��o dos itens " + numbers.get()
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE,  BigInteger::multiply));

        System.out.println("Menor n�mero " + numbers.get()
                    .reduce(0, Integer::min));

        System.out.println("Maior n�mero " + numbers.get()
                .reduce(0, Integer::max));
	}

}
