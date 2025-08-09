import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size=sc.nextInt();
        int []arr=new int[size];
        System.out.print("Enter the element:");
        for(int i=0;i<size;i++){
            
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<size;j++){
            System.out.print(arr[j]);

        }
    }
}
