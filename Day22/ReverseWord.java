package Day22;
import java.util.*;
public class ReverseWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string value:");
        String s=sc.nextLine();
        String rev="";
        String[]arr=s.split(" ");
        
        for(String x:arr){
            StringBuilder sb=new StringBuilder(x);
            rev=rev+sb.reverse()+" ";

        }
        System.out.println(rev);
    }
}
