package Day10;
import java.util.*;
public class treeSet {
    public static void main(String[] args) {
        TreeSet<String> Cloths=new TreeSet<>();
        Cloths.add("shirt");
        Cloths.add("Pant");
        Cloths.add("track");
        Cloths.add("t.shirt");
        Cloths.remove(0);
        System.out.println(Cloths);
        System.out.println(Cloths.size());
        System.out.println(Cloths.contains("John"));
        Cloths.clear();
        System.out.println(Cloths);
        


    }
}
