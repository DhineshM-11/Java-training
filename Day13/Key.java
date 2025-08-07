package Day13;

import java.util.*;

public class Key {
    public static void main(String[] args) {
        Map<Integer,String>a=new LinkedHashMap<>();
        a.put(23, "Arun");
        a.put(12, "Varun");
        a.put(45, "Vijay");
        a.put(67, "Ajith");
        System.out.println(a);
        for (int k :a.keySet()) System.out.print(a.get(k)+" ");

    }
}
