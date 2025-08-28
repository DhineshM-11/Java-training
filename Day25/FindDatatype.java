package Day25;
import java.util.*;
import java.math.*;
public class FindDatatype {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number count:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            try{
                long num=sc.nextLong();
                System.out.println("It can be filtered in:");
                if(num>=Short.MIN_VALUE && num<=Short.MAX_VALUE){
                    System.out.println("* short");
                }
                if(num>=Integer.MIN_VALUE && num<=Integer.MAX_VALUE){
                    System.out.println("* int");
                }
                if(num>=Long.MIN_VALUE && num<=Long.MAX_VALUE){
                    System.out.println("* long");
                }

            }
            catch(Exception e){
                System.out.println("It can not be filter");
            }
        }

    }
}
