import java.util.HashSet;
public class hashSet {
    public static void main(String []args){
        HashSet<String>Names=new HashSet<>();
        Names.add("Arun");
        Names.add("Vijay");
        Names.add("Siva");
        Names.add("John");
        Names.add("Arun");
        //Names.replace(1,"Ajith");
        System.out.println(Names);
        System.out.println( Names.size());
        System.out.println(Names.remove(1));
        System.out.println(Names);
        System.out.println(Names.contains("John")); 
        Names.clear();
        System.out.println(Names);
    }
}
