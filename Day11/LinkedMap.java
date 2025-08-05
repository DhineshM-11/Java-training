package Day11;
import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedMap {
    public static void main(String[] args) {
        Map<String,Integer>subjects= new LinkedHashMap<>();
        subjects.put("Data Structure",79);
        subjects.put("Network Security", 86);
        subjects.put("DSA", 84);
        subjects.put("CCS", 76);
        subjects.remove("CCS");
        System.out.println(subjects);

    }
}
