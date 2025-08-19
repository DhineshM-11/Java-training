package Day18;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        int rev=0;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        while(num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(temp==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
