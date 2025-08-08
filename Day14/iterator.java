package Day14;
import java.util.*;
public class iterator {
    public static void main(String[] args) {
        ArrayList<String>a=new ArrayList<>();
        a.add("hello");
        a.add("Hii");
        a.add("Welcome");
        a.add("Thankyou");
        System.out.println(a);
        Iterator<String> b=a.iterator();
        //System.out.println(b.next());
        //System.out.println(b.hasNext());
        while(b.hasNext()){
            String c=b.next();
            System.out.print(c+" ");
        }
    }
    
}
