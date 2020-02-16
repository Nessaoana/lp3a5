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
		
		
		// multiplicação
		JTextField primeiroM = new JTextField(10);
		JTextField segundoM = new JTextField(10);		
		JButton botao = new JButton(" = ");
		JLabel resultado = new JLabel("Resultado: ");
		
		
		JPanel painel = new JPanel();
		painel.add(primeiroM);
		painel.add(new JLabel("x"));
		painel.add(segundoM);
		painel.add(botao);
		painel.add(resultado);
		painel.add(new JLabel("\n"));
		
		botao.addActionListener(new AcaoBotao(primeiroM, segundoM, resultado, "x")); // fazendo o botão funcionar
		
		// adição
		
		
		
		JTextField primeiroA= new JTextField(10);
		JTextField segundoA = new JTextField(10);
		JButton botaoA = new JButton(" = ");
		JLabel resultadoA = new JLabel("Resultado: ");
				
				
		botaoA.addActionListener(new AcaoBotao(primeiroA, segundoA, resultadoA, "+")); // fazendo o botão funcionar
				
				
		painel.add(primeiroA);
		painel.add(new JLabel("+"));
		painel.add(segundoA);
		painel.add(botaoA);
		painel.add(resultadoA);
		painel.add(new JLabel("\n"));
		
		// subtraçao
		 
		
		JTextField primeiroS= new JTextField(10);
		JTextField segundoS = new JTextField(10);
		JButton botaoS = new JButton(" = ");
		JLabel resultadoS = new JLabel("Resultado: ");
				
				
		botaoS.addActionListener(new AcaoBotao(primeiroS, segundoS, resultadoS, "-")); // fazendo o botão funcionar
				
				
		painel.add(primeiroS);
		painel.add(new JLabel("-"));
		painel.add(segundoS);
		painel.add(botaoS);
		painel.add(resultadoS);
		painel.add(new JLabel("\n"));
		
		
		// Divisão
		
		
		JTextField primeiroD= new JTextField(10);
		JTextField segundoD = new JTextField(10);
		JButton botaoD = new JButton(" = ");
		JLabel resultadoD = new JLabel("Resultado: ");
				
				
		botaoD.addActionListener(new AcaoBotao(primeiroD, segundoD, resultadoD, "/")); // fazendo o botão funcionar
				
				
		painel.add(primeiroD);
		painel.add(new JLabel("/"));
		painel.add(segundoD);
		painel.add(botaoD);
		painel.add(resultadoD);
		painel.add(new JLabel("\n"));
		
		
		
		
		
		janela.setPreferredSize(new Dimension(450, 300));
		janela.add(painel);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.pack();
		janela.setVisible(true);
		

		
		
	}
}
