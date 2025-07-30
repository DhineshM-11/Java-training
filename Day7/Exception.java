package Day7;
import java.util.Scanner;

public class Exception {
	public static void  main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value1:");
		double a=sc.nextDouble();
		System.out.print("Enter the value2:");
		double b=sc.nextDouble();
		
		try {
		System.out.println(a/b);
		//getmessage();
	    }
	catch(ArithmeticException e) {
		System.out.println("Cannot by divide by zero");
		}
	
	}
}
