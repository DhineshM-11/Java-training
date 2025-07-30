package Day6;
import java.util.Scanner;
public class Vowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String:");
        String a=sc.nextLine();
        a=a.toLowerCase();
        int vowel=0;
        int consonant=0;
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            if(Character.isLetter(ch)){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vowel++;
                }
                else{
                    consonant++;
                }
            }
        }
        System.out.println("Vowel:"+vowel);
        System.out.println("Consonant:"+consonant);
    }
}
