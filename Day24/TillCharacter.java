package Day24;
import java.util.*;
public class TillCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch=sc.next().charAt(0);
        String b="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=ch){
                b+=s.charAt(i);
            }
            else{
                break;
            }
        }
        System.out.println(b);
    }
}
