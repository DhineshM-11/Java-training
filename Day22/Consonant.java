package Day22;
import java.util.*;
public class Consonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String value:");
        String a=sc.nextLine();
        String c=a.toLowerCase();
        c.split(" ");
        char[]ch=c.toCharArray();
        int count=0;
        for(int i=0;i<ch.length;i++){
            char b=ch[i];
            if(b!='a'&& b!='e'&& b!='i'&& b!='o'&& b!='u'){
                count++;
            }
        }
        System.out.println(count);

    }
}
