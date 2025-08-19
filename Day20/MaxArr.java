package Day20;
import java.util.*;
public class MaxArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the Array:");
        int size=sc.nextInt();
        int[]arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int max=0;
        for(int j=1;j<size;j++){
            if(arr[j-1]>arr[j]){
                max=arr[j-1];
                // arr[j-1]=arr[j];
            }
            else{
                max=arr[j];
            }
        }
        System.out.println("Max:"+max);


    }
}
