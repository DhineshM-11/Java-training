package Day7;
import java.util.Scanner;
import java.lang.Exception;

public class Array {
	public static void main(String[]args) {
	int[]arr= {3,4,7,8,5};
    Scanner sc=new Scanner(System.in);
 	System.out.print("Enter the index of the element:");
 	int a=sc.nextInt();
 	
 	try {
 		System.out.println("Element are:"+arr[a]);
 		
 	}
 	catch(Exception e) {
 		//System.out.println(e.getMessage());
 		//System.out.println(e.toString());
 		e.printStackTrace();
 		
  }
  
 }
}