package excecoes.ex2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class main {

	public static void main(String[] args) {
		
		System.out.println(lerArquivo("./nome.txt") + " " + lerArquivo("./sobrenome.txt"));

	}
	
	public static String lerArquivo(String arquivo ) {
	
		try{
		    
			FileReader arq = new FileReader(arquivo);
		    BufferedReader lerArq = new BufferedReader(arq);
	
		    String linha = lerArq.readLine();
		    arq.close();
		    return linha;
	    }catch (IOException e) {
	        System.err.printf("Erro na abertura do arquivo: ",
	          e.getMessage());
	    }
		
		return null;
	}

}
