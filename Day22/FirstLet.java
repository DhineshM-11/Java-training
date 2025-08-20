package Day22;
import java.util.*;
public class FirstLet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String value:");
        String s=sc.nextLine();
        String []sh=s.split(" ");
        String x="";
        for(String hs:sh){
            char a=hs.charAt(0);
            char b=Character.toUpperCase(a);
            String z=hs.substring(1);
            x=x+b+z+" ";

        }
        System.out.println(x);

    }
}
