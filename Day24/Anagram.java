package Day24;
import java.util.*;
 class Anagram1 {
    void anagram(String s1,String s2){
        // if(s1.length()!=s2.length()){
        //     System.out.println("Not a Anagram");
        // }
        char[]ch1=s1.toCharArray();
        char[]ch2=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2)){
            System.out.println("It is Anagram");
        }
        else{
            System.out.println("Not a Anagram");
        }


    }
}
public class Anagram{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        Anagram1 a1=new Anagram1();
        a1.anagram(s1,s2);

    }
}