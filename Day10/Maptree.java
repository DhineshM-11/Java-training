package Day10;
import java.util.TreeMap;
public class Maptree {
    
    public static void main(String[]args){
        TreeMap<String,String>color=new TreeMap<>();
        color.put("col_1","Red");
        color.put("col_2","Green");
        color.put("col_4","Yellow");
        color.put("col_3", "Pink");
        System.out.println(color);
        System.out.println(color.get("col_2"));
    }
}
