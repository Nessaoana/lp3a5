package aula1;

import java.math.BigInteger;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class TarefaMultiplicacao implements Runnable {

	
	// implements Runnable para que o código possa ser run 
	
	private JTextField primeiro;
	private JTextField segundo;
	private JLabel resultado;
	
	
	
	public TarefaMultiplicacao(JTextField primeiro, JTextField segundo, JLabel resultado) {
		this.primeiro = primeiro;
		this.segundo = segundo;
		this.resultado = resultado;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		long valor1 = Long.parseLong(primeiro.getText());
		long valor2 = Long.parseLong(segundo.getText());
		BigInteger calculo = new BigInteger("0");
		
		// fazendo o programa a ficar lento
		
		
		for (int i=0; i<valor1 ; i++) {
			for(int y=0; y<valor2 ; y++) {
				calculo = calculo.add(new BigInteger("1"));
				
			}
		}
		
		resultado.setText(calculo.toString());
	}

}
