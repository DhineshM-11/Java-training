package Day23;
import java.util.*;
public class Unique {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Set<Integer>s=new HashSet<>();
        for(int x:arr){
            s.add(x);
        }
        System.out.println(s);
    }
    
}
