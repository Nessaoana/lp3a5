package exercicio13;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CaixaEletronico cx = new CaixaEletronico(10000);
		
		Thread cliente1 = new Thread(new Saque(cx, 100), "saque");
		Thread cliente2 = new Thread(new Transferencia(cx), "transferencia");
		
		cliente1.start();
		cliente2.start();

	}

}
