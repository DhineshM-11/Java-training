package Day19;
import java.util.Scanner;
public class Prime50 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to print primeNumber:");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            int count=0;
        for(int j=2;j<=i/2;j++){
            if(i%j==0){
                count++;
            }

        }   
        if(count==0){
            System.out.println(i);
        }
         }
         
    }
}
