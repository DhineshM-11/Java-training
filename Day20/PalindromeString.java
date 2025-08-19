package Day20;
import java.util.*;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String a=sc.nextLine();
        String rev="";
        for(int i=a.length()-1;i>=0;i--){
            rev=rev+a.charAt(i);

        }
        if(a.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }

    }
}
