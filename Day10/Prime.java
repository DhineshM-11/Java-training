import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        if(num!=0){
            num=num%2;
            if(num==0){
                System.out.println("Not a prime");
            }
            else{
                System.out.println(" prime");
            }     
        }
       else{
        System.out.println("Zero");
       }
    }
}
