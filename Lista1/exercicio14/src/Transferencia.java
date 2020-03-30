

public class Transferencia implements Runnable{
	
	private CaixaEletronico cx;
	
	public Transferencia(CaixaEletronico cx) {
		super();
		this.cx = cx;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		this.cx.Transferencia();
	}

}
