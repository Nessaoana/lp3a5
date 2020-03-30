

public class CaixaEletronico {

	private float saldoInicial;
	
	
	
	public float getSaldoInicial() {
		return saldoInicial;
	}


	public void setSaldoInicial(float saldoInicial) {
		this.saldoInicial = saldoInicial;
	}


	public CaixaEletronico(float saldoInicial) {
		super();
		this.saldoInicial = saldoInicial;
	}


	public CaixaEletronico() {
		super();
	}


	public void Transferencia() {
			
			String nome = Thread.currentThread().getName();
			
			System.out.println(nome + " procurando caixa eletronico");
			
			synchronized (this) {
				System.out.println(nome + " Entrou no caixa eletronico!");
				System.out.println(nome + " fazendo tranferência!");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(nome +  " colocando dados da tranferência");
				System.out.println(nome +  " saindo do caixa eletronico");
	
			}
	
		}
		
		
		public void Saque(float valor) {
			
			if (valor > this.saldoInicial) {
				this.AlimentaCedulas();
			}else {
				this.saldoInicial -= valor;
			}
			
			
			String nome = Thread.currentThread().getName();
			
			System.out.println(nome + " procurando caixa eletronico");
			synchronized (this) {
				System.out.println(nome + " Entrou no caixa eletronico!");
				System.out.println(nome + " fazendo saque!");
				try {
					Thread.sleep(8000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(nome +  " contando notas");
				System.out.println(nome +  " saindo do caixa eletronico");
			}
			
		}
		
		public void AlimentaCedulas () {
			
			String nome = Thread.currentThread().getName();
			
			System.out.println(nome + " Caixa eletrônico sem notas ");
			synchronized (this) {
				System.out.println(nome + " Alimentando caixa eletronico!");
				try {
					this.saldoInicial +=1000;
					Thread.sleep(8000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Saldo no caixa: " + this.saldoInicial);
			}
		}

}
