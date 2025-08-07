package Day10;
import java.util.HashMap;
public class map1 {
    public static void main(String[] args) {
       HashMap<Integer,String> Names=new HashMap<Integer,String>(); 
       Names.put(1, "Vijay");
       Names.put(2, "tharun");
       Names.put(4,"john");
       Names.put(1, "Dhoni");
       System.out.println(Names);
       System.out.println(Names.get(2));

        
       
    }
}
