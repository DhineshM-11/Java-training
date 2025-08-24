package Day24;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=0;
        int b=1;
        System.out.print("Enter the number to generate fibonacci series:");
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            System.out.println(a);
            int x=a+b;
            a=b;
            b=x;
        }
    }
}
