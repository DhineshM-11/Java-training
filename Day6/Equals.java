package Day6;
import java.util.Scanner;
public class Equals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the First String: ");
        String a=sc.nextLine();
        System.out.print("Enter the second String: ");
        String b=sc.nextLine();
        System.out.println(a.equalsIgnoreCase(b));
    }
}
