package Day22;
import java.util.*;
import java.util.Map.Entry;
public class ConValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String value:");
        String s=sc.nextLine();
        String x=s.toLowerCase();
        char[]a=x.toCharArray();
        Map<Character,Integer>m=new TreeMap<>();
        for(int i=0;i<a.length;i++){
            char c=a[i];
           if(c>='a' && c<='z'){
            if(c!='a'&&c!='e'&& c!='i'&& c!='o'&& c!='u'){
                if(m.containsKey(c)){
                    int j=m.get(a[i]);
                    m.put(c,j+1);
                }
                else{
                    m.put(c,1);
                }
            }
         }
        }
     
        Set<Entry<Character,Integer>>entry=m.entrySet();
        for(Entry<Character,Integer>z:entry){
            System.out.println(z);
        }
    }
}
