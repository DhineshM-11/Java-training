import java.util.ArrayList;
import java.util.LinkedList;
public class linklist {
    public static void main(String[] args) {
    LinkedList<String>fruits=new LinkedList<>();
    //ArrayList<>fruit=new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Orange");
    System.out.println(fruits.removeLast());
    System.out.println(fruits.size());
    fruits.addFirst("Banana");
    System.out.println(fruits);

    }
}