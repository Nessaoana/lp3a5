package aula1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AcaoBotao implements ActionListener{
	
	private JTextField primeiro;
	private JTextField segundo;
	private JLabel resultado;
	

	
	
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



	public AcaoBotao(JTextField primeiro, JTextField segundo, JLabel resultado) {
		this.primeiro = primeiro;
		this.segundo = segundo;
		this.resultado = resultado;
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		
		TarefaMultiplicacao tarefa = new TarefaMultiplicacao(primeiro, segundo, resultado);
		Thread minhathread = new Thread(tarefa, "MeuNome");
		minhathread.start();
		
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
		
	}

}
