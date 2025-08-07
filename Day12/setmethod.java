package Day12;

import java.util.Stack;

public class setmethod {
    public static void main(String[] args) {
        Stack <Integer>a=new Stack<>();
        a.push(3);
        a.push(7);
        a.push(5);
        a.push(10);
        System.out.println(a);
        a.pop();
        System.out.println(a.peek());
        System.out.println(a);
    }
   
}

