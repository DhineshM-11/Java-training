import java.util.*;


public class list {
    public static void main(String[] args) {
        List<String>fruits=new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        System.out.println(fruits);
        System.out.println(fruits.get(2));
        System.out.println(fruits.set(1, "grapes"));
        System.out.println(fruits);
        System.out.println(fruits.remove(0));

    }
}
