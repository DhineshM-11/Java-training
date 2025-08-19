package Day19;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int fact=1;
        while(num>0){
            // int rem=num%10;
            fact=fact*num;
            num-=1;

        }
        System.out.println("Factorial of:"+fact);
    }
}
