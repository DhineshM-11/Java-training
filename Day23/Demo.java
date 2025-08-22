import java.util.*;
public class Demo {
public static void main(String[] args) {
LinkedHashMap<Integer, String> cart = new LinkedHashMap<>();
cart.put(1, "Laptop");
cart.put(2, "Phone");
cart.put(3, "Headphones");
System.out.println(cart);
}
}