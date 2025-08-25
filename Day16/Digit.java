package Day16;
import java.util.*;
public class Digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                count++;
            }
            
        }
        System.out.println(count);
    }
}
