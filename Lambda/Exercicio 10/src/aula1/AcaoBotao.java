package aula1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AcaoBotao implements ActionListener{
	
	private JTextField primeiro;
	private JTextField segundo;
	private JLabel resultado;
	private String op;
	
	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public JTextField getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(JTextField primeiro) {
		this.primeiro = primeiro;
	}

	public JTextField getSegundo() {
		return segundo;
	}

	public void setSegundo(JTextField segundo) {
		this.segundo = segundo;
	}

	public JLabel getResultado() {
		return resultado;
	}

	public void setResultado(JLabel resultado) {
		this.resultado = resultado;
	}




	public AcaoBotao(JTextField primeiro, JTextField segundo, JLabel resultado, String op) {
		this.primeiro = primeiro;
		this.segundo = segundo;
		this.resultado = resultado;
		this.op = op;
	}



	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		
		
		
		System.out.println(op);
		switch(this.op) {
		
			case "x":				
				new Thread( () -> {
					long valor1 = Long.parseLong(primeiro.getText());
					long valor2 = Long.parseLong(segundo.getText());

					
					resultado.setText(String.valueOf(valor1*valor2));
					
				}).start();
				
				break;
				
			
			case "+":
				
				new Thread( () -> {
					long valor1 = Long.parseLong(primeiro.getText());
					long valor2 = Long.parseLong(segundo.getText());

					
					resultado.setText(String.valueOf(valor1+valor2));
					
				}).start();
				
				break;
			
			case "-":
				new Thread( () -> {
					long valor1 = Long.parseLong(primeiro.getText());
					long valor2 = Long.parseLong(segundo.getText());
					
					resultado.setText(String.valueOf(valor1-valor2));
				}).start();
				
				break;
			case "/":
				new Thread( () -> {
					
					long valor1 = Long.parseLong(primeiro.getText());
					long valor2 = Long.parseLong(segundo.getText());
				
					
					resultado.setText(String.valueOf(valor1/valor2));
				}).start();
				
				break;
			
		}
	}

}
		
		
		/*
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
		*/
		
	
	
	