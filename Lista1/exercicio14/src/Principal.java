

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CaixaEletronico cx = new CaixaEletronico(100);
		
		Thread cliente1 = new Thread(new Saque(cx, 101), "saque");
		Thread cliente2 = new Thread(new Transferencia(cx), "transferencia");
		
		
		cliente1.start();
		cliente2.start();

	}

}
