package Day22;
import java.util.*;
public class Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of String:");
        String s=sc.nextLine();
        char[]arr=s.toCharArray();
        String num="";
        for(char c:arr){
            if(c>='0'&&c<='9'){
                num=num+c;
            }
        }
        System.out.println(num);
    }
    
}
