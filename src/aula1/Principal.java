package aula1;

import java.awt.Dimension;

import javax.swing.*;

public class Principal {
	public static void main(String[] args) throws InterruptedException {
		
		// ver o thread no JCONSOLE pelo CMD
		// System.out.print(" teste ");
		// Thread.sleep(50000);
		
		
		
		// Calculadora
		JFrame janela = new JFrame("calculadora");
		
		JTextField primeiro = new JTextField(10);
		JTextField segundo = new JTextField(10);
		JButton botao = new JButton(" = ");
		JLabel resultado = new JLabel("Resultado: ");
		
		botao.addActionListener(new AcaoBotao(primeiro, segundo, resultado));
		
		
		JPanel painel = new JPanel();
		painel.add(primeiro);
		painel.add(new JLabel("x"));
		painel.add(segundo);
		painel.add(botao);
		painel.add(resultado);
		
		
		janela.setPreferredSize(new Dimension(450, 300));
		janela.add(painel);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.pack();
		janela.setVisible(true);
		
		
		
		
	}
}
