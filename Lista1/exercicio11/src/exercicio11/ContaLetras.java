package exercicio11;

public class ContaLetras implements Runnable  {

	private String palavra;
	private int vogal;
	private int consoante;
	
	
	public int getVogal() {
		return vogal;
	}

	public void setVogal(int vogal) {
		this.vogal = vogal;
	}

	public int getConsoante() {
		return consoante;
	}

	public void setConsoante(int consoante) {
		this.consoante = consoante;
	}

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}


	public ContaLetras(String palavra) {
		super();
		this.palavra = palavra;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		int p = palavra.length();
		char letra;
		int v = 0;
		int c = 0;
		
		
		while(p>0) {
			
			letra = palavra.toUpperCase().charAt(p-1);
			
			if("A".equals(String.valueOf(letra)) || "E".equals(String.valueOf(letra)) || "I".equals(String.valueOf(letra)) || "O".equals(String.valueOf(letra)) || "U".equals(String.valueOf(letra))) {
				
				v += 1;
				
			}else {
				c +=1;
			}
			
			p -= 1;


		}
		
		this.consoante=c;
		this.vogal = v;
	}
	
	

}
