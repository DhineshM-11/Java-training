package Day13;

import java.util.LinkedHashSet;
import java.util.Set;

public class Each {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("B");
        set.add("A");
        set.add("C");
        System.out.println(set);
        for (String s : set) 
        System.out.print(s);   
    }
}
