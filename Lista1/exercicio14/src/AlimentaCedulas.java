
public class AlimentaCedulas implements Runnable {

	
	private CaixaEletronico cx;
	
	public AlimentaCedulas(CaixaEletronico cx) {
		super();
		this.cx = cx;
	}

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		this.cx.AlimentaCedulas();
		
	}

}
