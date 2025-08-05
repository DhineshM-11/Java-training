import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String val=sc.nextLine();
        String rev="";
        for(int i=val.length()-1;i>=0;i--){
          
            rev+=val.charAt(i);
          
        }
        System.out.println(rev);
        if(val.equals(rev)){
            System.out.println("It is Palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
}
