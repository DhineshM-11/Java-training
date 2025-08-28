package Day25;
import java.util.*;
import java.util.Scanner;

public class IntString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to convert to string:");
        int a=sc.nextInt();
        String s=Integer.toString(a);
        if(a==Integer.parseInt(s)){
            System.out.println("good job");
        }
        else{
            System.out.println("wrong");
        }
    }
}
