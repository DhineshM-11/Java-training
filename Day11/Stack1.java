package Day11;
//import java.util.Stack;
import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<String>a=new Stack<>();
        a.push("arun");
        a.push("john");
        a.push("sam");
        a.pop();
        System.out.println(a.peek());
    }
}
