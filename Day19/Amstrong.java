package Day19;
import java.util.*;
public class Amstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int temp=num;
        String s=Integer.toString(num);
        StringBuilder a=new StringBuilder(s);
        int b=a.length();
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum+(int)Math.pow(rem,b);
            num=num/10;
        }
        if(sum==temp){
            System.out.println("Amstrong");
        }
        else{
            System.out.println("Not a Amstrong");
        }

    }
}
