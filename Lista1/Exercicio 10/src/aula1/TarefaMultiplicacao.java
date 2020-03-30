package aula1;

import java.math.BigInteger;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class TarefaMultiplicacao implements Runnable {

	
	// implements Runnable para que o c�digo possa ser run 
	
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

		
		resultado.setText(String.valueOf(valor1*valor2));
	}

}
