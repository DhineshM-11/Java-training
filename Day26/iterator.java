import java.util.*;
import java.util.Iterator;
public class iterator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer>a=new ArrayList<>();
        a.add(10);
        a.add(25);
        a.add(56);
        a.add(90);
        Iterator<Integer>b=a.iterator();
        while(b.hasNext()){
            System.out.println(b.next());
        }
    }
}
