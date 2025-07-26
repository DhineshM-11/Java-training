package hello;
import java.util.Scanner;


public class Calculator{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int a,b;
        char ch;
        System.out.println("Enter the first value:");
          a=sc.nextInt();
         System.out.println("Enter the second value:");
          b=sc.nextInt();
         System.out.println("Enter the operation('+,-,*,/,%')to be perform:");
          ch=sc.next().charAt(0);
         
    
    
    if(ch=='+'){
        System.out.println("Addition of two number is "+(a+b));
    }
    else if(ch=='-'){
        System.out.println("Subraction of two number is "+(a-b));
    }
    else if(ch=='*'){
        
            System.out.println("Multipication of two number is "+(a*b));
        
    }
    else if(ch=='/'){
        try{
            float c=(float)a/b;
            System.out.println("Division of two number is "+c);
        }
        catch (Exception e){
            System.out.println("Division by zero error");
        }

    }
    else if(ch=='%'){
        if(b!=0){
        System.out.println("Moduloo of two number is "+(a%b));
        }
        else{
            System.out.println("Mod by zero is not allowed");
        }
    }
    else{
        System.out.println("Enter the valid operator");
    }
   

}
}