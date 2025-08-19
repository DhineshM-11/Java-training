package Day19;
import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int count=0;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                count++;
            }

        }
        if(count==0){
            System.out.println("prime number");
        }
        else{
            System.out.println("Not a prime number");
        }

    }
}
