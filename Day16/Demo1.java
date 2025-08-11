package Day16;
import java.util.*;
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size:");
        int size=sc.nextInt();
        int [][]arr=new int[size][size];
        System.out.println("Enter the array element:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("============");
         for(int a=0;a<arr.length;a++){
            for(int b=0;b<arr.length;b++){
                System.out.print(arr[a][b]+" ");
            }System.out.println();
         } 
        
    }
}
