public class BankAccount {
    
	String name;
	double balance;
	BankAccount(String name,double balance){
		this.name=name;
		this.balance=balance;
	
	}
	void deposit(int credit) {
		balance= balance+credit;
		System.out.println("Amount "+credit+" credited and the actual balance is: "+balance);
		
	}
	void withdraw(int debit) {
		balance=balance-debit;
		System.out.println("Amount "+debit+" debited and the bank balance is: "+balance);
		
	}
    public static void main(String []args) {
		BankAccount b1=new BankAccount("Vijay",20000);
		b1.deposit(4000);
		b1.withdraw(3000);
 }
}
