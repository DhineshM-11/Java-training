package Day24;
import java.util.*;
import java.math.*;
public class Square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number for square:");
        int num=sc.nextInt();
        int b=0;
        for(int i=0;i<=num;i++){
            b=num*i;

        }
        System.out.println("Square value:"+b);
        

    }
}
