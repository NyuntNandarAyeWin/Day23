package AccountTransfer;

public class Account {
	String id = "";
	String name = "";
	int balance = 0;
	
	public Account(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	public void credit(int amount) {
		this.balance += amount;
		System.out.println(toString());
	}
	
	public void debit(int amount) {
		if(balance > amount) {
			this.balance -= amount;
			System.out.println(toString());
		}else {
			System.out.println("Amount not insufficent");
		}
		///return balance;
	}
	
	public void transferTo(Account another, int amount) {
		System.out.println("Transfer "+amount+" to "+ another.name);
		if(this.balance > amount) {
			balance -= amount;
			another.credit(amount);
			System.out.println(toString());
		}else {
			System.out.println("amount exceed than your balance!!");
		}
		//return balance;
	}
	public String toString() {
		String str = "Your id : "+this.id+" Your name : "+this.name+" Your balance : "+ this.balance;
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc1 = new Account("a1", "Hnin Hnin",100000);
		Account acc2 = new Account("a2", "Mg Mg",50000);
		System.out.println(acc1.toString());
		System.out.println(acc2.toString());
		
		acc1.transferTo(acc2, 20000);
	}

}
