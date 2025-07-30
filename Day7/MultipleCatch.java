package Day7;
import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array index:");
		int index=sc.nextInt();
		System.out.print("Enter the element for division:");
		int div=sc.nextInt();
		int []arr= {4,6,8,3,9,7};
		try {
			System.out.println(arr[index]);
			double c=arr[index]/div;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of bound");
		}
		catch(ArithmeticException e) {
			System.out.println("Zero divident Exception");
		}
    }
}
