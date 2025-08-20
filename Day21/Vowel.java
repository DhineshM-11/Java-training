package Day21;
import java.util.*;
public class Vowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String  s=sc.nextLine();
        String x=s.toLowerCase();
        int count=0;
        char[]ch=x.toCharArray();
        for(int i=0;i<ch.length;i++){
            char b=ch[i];
            if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u'){
                count++;
            }
        }
        System.out.println("Vowel count:"+count);
    }
}
