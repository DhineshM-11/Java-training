package Day8;

import java.util.Scanner;
public class Odd {
	public static void main(String[]args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the  value:");
		int a=sc.nextInt();
		for(int i=0;i<=a;i++) {
		if(i%2==0) {
			System.out.println("Even:"+i);
		}
		else {
			System.out.println("Odd:"+i);
		}
	}
		
	}
}
