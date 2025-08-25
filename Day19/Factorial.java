package Day19;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int a=sc.nextInt();
        int sum=0;
        while(a>0){
            int rem=a%10;
            sum=sum+rem;
            a=a/10;
        }
        System.out.println("Sum of the digits of given number:"+sum);
