package Day7;
import java.util.Scanner;
public class NumberFormat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value:");
        String a=sc.nextLine();
    try {
			Integer.parseInt(a);
		}
		catch(NumberFormatException e) {
			System.out.println("That is not a number");
		}
    }
}
