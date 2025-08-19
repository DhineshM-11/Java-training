package Day20;
import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String a=sc.nextLine();
        StringBuilder b=new StringBuilder(a);
        System.out.println(b.reverse());
    }
}
