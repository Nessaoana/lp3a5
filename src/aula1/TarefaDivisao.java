package aula1;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class TarefaDivisao implements Runnable {

	
	// implements Runnable para que o código possa ser run 
	
	private JTextField primeiro;
	private JTextField segundo;
	private JLabel resultado;
	
	
	
	public TarefaDivisao(JTextField primeiro, JTextField segundo, JLabel resultado) {
		this.primeiro = primeiro;
		this.segundo = segundo;
		this.resultado = resultado;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		long valor1 = Long.parseLong(primeiro.getText());
		long valor2 = Long.parseLong(segundo.getText());
		long calculo = 0;
		
		// fazendo o programa a ficar lento
		
		
		while(valor2 >= valor1) {
			valor2 = valor2 - valor1;
			calculo = calculo +1;
		}
		
		resultado.setText(String.valueOf(calculo));
	}
	


}
