package excecoes.ex1;

public class Calcula {

	public static int divide(int x, int y) throws ArithmeticException {
		
		if(x < 0) {
			throw new NumberFormatException("Erro-Argumento negativo");
		}else if (x>1000) {
			throw new NumberFormatException("Erro-Argumento muito grande");
		}else if(x <= 10000 && x != 0){
			throw new NumberFormatException("Erro-Argumento deve ser maior que x");
		}
		
		return y/x;
	}
}
