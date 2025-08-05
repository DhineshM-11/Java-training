import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number:");
        int first=sc.nextInt();
        System.out.print("Enter the Second number:");
        int second=sc.nextInt();
       /*  int temp=second;
        second=first;
        first=temp;
        System.out.println("First Number:"+first);
        System.out.println("Second Number:"+second);*/
        first=first+second;
        second=first-second;
        first=first-second;
        System.out.println(first);
        System.out.println(second);
        
    }
}
