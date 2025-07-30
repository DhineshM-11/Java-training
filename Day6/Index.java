package Day6;
import java.util.Scanner;
public class Index {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String:");
        String s2=sc.nextLine();
        StringBuilder s1=new StringBuilder(s2);
        System.out.println(s1.lastIndexOf("o"));
    }
}
