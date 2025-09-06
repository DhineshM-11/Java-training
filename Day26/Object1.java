import java.util.*;

public class Object1 {
    public static void main(String[] args) {
        ArrayList a=new ArrayList<>();
        a.add("Arjun");
        a.add("Vimal");
        a.add("John");
        a.add(25);
        for(Object b:a){
            System.out.println(b);
        }
    }
}
