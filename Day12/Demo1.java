package Day12;

import java.util.PriorityQueue;
import java.util.Queue;

public class Demo1 {
    public static void main(String[] args) {
        Queue<String>a=new PriorityQueue<>();
        a.add("B");
        a.add("A");
        a.add("D");
        a.add("C");
        System.out.println(a);
        a.remove("A");
        System.out.println(a);
        System.out.println(a.peek());
        System.out.println(a.poll());
        //System.out.println();


    }
}
