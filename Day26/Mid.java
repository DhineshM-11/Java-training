import java.util.*;
public class Mid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String s=String.valueOf(num);
        int len=s.length();
        if(len%2==0){
            System.out.println(s.charAt(len/2-1)+""+s.charAt(len/2));
        }
        else{
            System.out.println(s.charAt(len/2));
        }
    
}
}
