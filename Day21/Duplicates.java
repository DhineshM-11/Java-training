package Day21;
import java.util.*;
public class Duplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the Array:");
        int size=sc.nextInt();
        int[]arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Set<Integer>a=new HashSet<>();
        for(int b:arr){
            a.add(b);
        }
        System.out.println(a);

    }
}
