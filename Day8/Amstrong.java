package Day8;
import java.util.Scanner;
//import java.math.*;
class Amstrong {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		String a=String.valueOf(num);
		int digits= a.length();
		//System.out.println(digits);
		while(num!=0) {
			int rem=num%10;
			sum=sum+(int)Math.pow(rem,digits);
			num=num/10;	
		}
		if(sum==temp) {
			System.out.println("The given number is Amstrong");
		}
		else {
			System.out.println("The given number is not a Amstrong");
		}
	}
}
