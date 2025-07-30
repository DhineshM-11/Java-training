package Day5;

public class Bank1{
	String bankname;
	Bank1(String bankname){
		this.bankname=bankname;
	}
	void createAccount(String name) {
		System.out.println("Creating a account for:"+name);
	}
	void createAccount(String name,String type) {
		System.out.println("Creating a "+type+" account for:"+name);
	}
	void showInterestRate() {
		System.out.println("Interest rate is 3%");
	}
}

class savingsAccount  extends Bank1{
	savingsAccount(String bankname){
		super(bankname);
	}
	void showInterestRate(){
		System.out.println("Savings Account interest 2%");
	}
}

class CurrentAccount extends Bank1{
	CurrentAccount(String name){
		super(name);
	}
	void showInterestRate() {
		System.out.println("Current account Interest rate is 3%");
	}
}

class Hello{
	public static void main(String []args) {
		Bank1 b1=new Bank1("IOB");
		b1.createAccount("Prajan");
		b1.createAccount("John","CurrentAccount");
		//CurrentAccount c1=new CurrentAccount("Indian");
		Bank1 b2=new savingsAccount("Indian");
		b2.showInterestRate();
		b2.createAccount("Arun");
		b2.createAccount("Arun", "Saving Account");
		
	}
}