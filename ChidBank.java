package Day23;

public class ChidBank extends Bank implements BankFunction{

	double totAmt = 0;
	public ChidBank(double amt) {
		super(amt);
		this.totAmt = amt;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChidBank cb = new ChidBank(100000);
		System.out.println("Before witdraw/deposite your bank amount : "+cb.totAmt);
		cb.increment(10000.0);
		cb.decrement(60000.0);
	}

	@Override
	public void increment(double amt) {
		// TODO Auto-generated method stub
		totAmt += amt;
		System.out.println("Afer Deposite "+amt+" is "+totAmt);
	}

	@Override
	public void decrement(double amt) {
		
		// TODO Auto-generated method stub
		totAmt -= amt;
		System.out.println("Afer Witdraw "+amt+" is "+totAmt);
	}

}
