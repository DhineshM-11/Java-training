package Day8;

import java.util.Scanner;
public class Age {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Age:");
		int age=sc.nextInt();
		if(age>=18 && age<=100) {
			System.out.println("Eligible for vote");
		}
		else {
			System.out.println("Not eligile for vote");
		}
    }
}