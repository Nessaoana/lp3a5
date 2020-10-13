package excecoes.ex1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor de X");
	    int x = scanner.nextInt();
	    
	    System.out.println("Digite o valor de y");
	    int y = scanner.nextInt();
	    
	    try {
	    	Calcula.divide(x, y);
	    }catch(NumberFormatException e ) {
	    	System.out.println(e);
	    }catch(ArithmeticException e) {
	    	System.out.println(e);
	    }catch(Exception e) {
	    	System.out.println(e);
	    }finally {
	    	System.out.println("Finalizada a execução do método dividir");
	    }
	}

}
