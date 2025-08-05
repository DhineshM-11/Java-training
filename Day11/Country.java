package Day11;
import java.util.HashMap;
import java.util.Map;
public class Country {
    public static void main(String[] args) {
        Map<String,String>country=new HashMap<>();
        country.put("India", "Delhi");
        country.put("France", "Paris");
        country.put("Italy", "Rome");
        country.put("Japan", "Tokyo;");
        country.remove("Italy");
        System.out.println(country);
    }
}
