package Day21;
import java.util.*;
public class Words {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string value:");
        String s=sc.nextLine();
        String[]a=s.split(" ");
        System.out.println(a.length);
    }
}
