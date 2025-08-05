package Day11;

import java.util.Arrays;
import java.util.Collections;

public class Descending {
    public static void main(String[] args) {
        Integer[] numbers = {10, 50, 24, 40, 60}; 
        Arrays.sort(numbers, Collections.reverseOrder()); 
        System.out.println(Arrays.toString(numbers)); 
    }
}

