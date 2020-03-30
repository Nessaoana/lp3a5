package exercicio11;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String palavra = "nessa";
		
		ContaLetras conta = new ContaLetras(palavra);
		
		Thread tr = new Thread(conta, "Contando...");
		
		tr.run();
		
		System.out.println("Consoantes: " + conta.getConsoante());
		
		
		System.out.println("Vogais: " + conta.getVogal());

	}

}
