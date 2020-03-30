

public class Saque implements Runnable {

	private CaixaEletronico cx;
	private float valor;
	



	public Saque(CaixaEletronico cx, float valor) {
		super();
		this.cx = cx;
		this.valor = valor;
	}



	public float getValor() {
		return valor;
	}



	public void setValor(float valor) {
		this.valor = valor;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		this.cx.Saque(valor);
	}

	
}
