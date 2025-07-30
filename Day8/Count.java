package Day8;
import java.util.Scanner;
public class Count {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value:");
		int a=sc.nextInt();
		int count=0;
		for(int i=1;i<=a;i++) {
			if(i%2==0) {
				count++;
			}
		}
		System.out.println("Total count of Even Numbers:"+count);
	}
}
