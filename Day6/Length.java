package Day6;
import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String:");
        String s1=sc.nextLine();
        StringBuilder s2=new StringBuilder(s1);
        System.out.println(s2.length());
    }
}
