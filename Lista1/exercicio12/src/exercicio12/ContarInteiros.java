package exercicio12;

public class ContarInteiros implements Runnable{
	
	private int num1;
	private int num2;
	private int inteiros;
	

	public int getInteiros() {
		return inteiros;
	}

	public void setInteiros(int inteiros) {
		this.inteiros = inteiros;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	
	public ContarInteiros(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		int result = 0;
		int inteiros = 0;
		
		
		if((num2-1) != num1) {
			while(result<num2) {
				result = num1 + (num1 + 1);
				inteiros ++;
			}
			
			this.inteiros = inteiros;
			
		}
		
	
	}
}
