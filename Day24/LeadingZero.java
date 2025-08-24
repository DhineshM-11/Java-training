package Day24;
import java.util.*;
public class LeadingZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value:");
        int a=sc.nextInt();
        String s=Integer.toString(a);
       // System.out.println(s);
        StringBuilder sb=new StringBuilder(s);
        while(s.charAt(0)=='0'){
            
                sb.deleteCharAt(s.charAt(0));
            
        }
        System.out.println(sb);
     }
}
