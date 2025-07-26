package hello;

public class BankAccount {
    String account_holder;
    float balance;
    void check_balance(){
        System.out.println("Balance:"+balance+" Rupees");

    }
    public static void main(String[] args) {
        BankAccount b1=new BankAccount();
        b1.balance=23351.5f;
        b1.check_balance();

    }
}
