package Day13;
import java.util.*;

public class High {
    public static void main(String[] args) {
        TreeSet<Integer>a=new TreeSet<>();
        a.add(4);
        a.add(9);
        a.add(5);
        a.add(3);
        a.add(10);
        System.out.println(a.getClass());
        System.out.println(a.pollFirst());
        System.out.println(a);
        System.out.println(a.higher(5));
        System.out.println(a.lower(6));
        List<Integer>b=new ArrayList<>(a);
        Collections.sort(b);
        System.out.println(b);

    }
}
