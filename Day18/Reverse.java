package Day18;
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        int reverse=0;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rem;
        while(num>0){
            rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
           // System.out.print(rem);
        }
        System.out.println(reverse);
    }
}
