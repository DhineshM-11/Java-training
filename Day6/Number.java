package Day6;
import java.util.Scanner;
public class Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Mobile number:");
        String num=sc.nextLine();
        
        if(num.matches("\\d+")){
            System.out.println("Valid number");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
