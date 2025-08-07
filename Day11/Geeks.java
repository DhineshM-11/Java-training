package Day11;

import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {
      
        // Create a HashMap
        HashMap<String, Integer> hm = new HashMap<>();

        // Add key-value pairs
        hm.put(null, 1);
        hm.put(null,2);
        hm.put("weee",null);

        System.out.println("HashMap: " + hm);

    }
}