package exercicio11;

import org.apache.commons.lang3.StringUtils;

public class ContaLetras {

	public static void main(String[] args) {
		
		String palavra = "joão";
		
		new Thread(() -> {
			String palavra1;
			int p = palavra.length();
			int v = 0;
			int c = 0;
			
			palavra1 = StringUtils.stripAccents(palavra);		    	
			
			while(p>0) {
				
				char letra = palavra1.toUpperCase().charAt(p-1);
				
				if("A".equals(String.valueOf(letra)) || "E".equals(String.valueOf(letra)) || "I".equals(String.valueOf(letra)) 
						|| "O".equals(String.valueOf(letra)) || "U".equals(String.valueOf(letra)))
					v += 1;	
				else if (!" ".equals(String.valueOf(letra)))
					c +=1;

				
				p -= 1;


			}
			
			System.out.println("Consoantes: " + c);			
			System.out.println("Vogais: " + v);
			
		} ).run();
		
		
	}

}
