package aula1;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class TarefaSubtracao implements Runnable {

	
	// implements Runnable para que o c�digo possa ser run 
	
	private JTextField primeiro;
	private JTextField segundo;
	private JLabel resultado;
	
	
	
	public TarefaSubtracao(JTextField primeiro, JTextField segundo, JLabel resultado) {
		this.primeiro = primeiro;
		this.segundo = segundo;
		this.resultado = resultado;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		long valor1 = Long.parseLong(primeiro.getText());
		long valor2 = Long.parseLong(segundo.getText());
		long calculo = valor1;
		
		// fazendo o programa a ficar lento
		
		
		
			for(int y=0; y<valor2 ; y++) {
				calculo = calculo - 1;
				
			}
		
		
		resultado.setText(String.valueOf(calculo));
	}

}
