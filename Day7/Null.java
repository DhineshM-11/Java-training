package Day7;
import java.util.Scanner;
public class Null {
	
	public static void main(String[]args) {
		//Scanner sc=new Scanner(System.in);
		String a=null;
		try {
			int b=a.length();
			System.out.println(b);
		}
		catch(NullPointerException e) {
			System.out.println("Oops you're trying to give null object");
		}
    }
}