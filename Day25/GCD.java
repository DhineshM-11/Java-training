package Day25;
import java.util.*;
public class GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number:");
        int x=sc.nextInt();
        System.out.print("Enter the second number:");
        int y=sc.nextInt();
        while(y!=0){
            int temp=y;
            y=x%y;
            x=temp;
        }
        System.out.println("GCD:"+x);
    }
}
