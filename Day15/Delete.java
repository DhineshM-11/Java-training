import java.util.Arrays;
import java.util.*;
public class Delete {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr=new int[6];
        // arr[0]=3;
        // arr[1]=5;
        // arr[2]=10;
        // arr[3]=16;
        // arr[4]=2;
        // arr[5]=8;
        System.out.println("Enter the Array element:");
        for(int a=0;a<arr.length;a++){
            arr[a]=sc.nextInt();
        }
        int indx=3;
        for(int i=indx;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }      
          arr[arr.length-1]=0;
          System.out.println("===============");
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]+" ");
        }
        System.out.println("===============");
        System.out.println(Arrays.toString(arr));
        
      
    }
}

