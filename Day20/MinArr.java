package Day20;
import java.util.*;
public class MinArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int min=0;
        for(int a=0;a<size;a++){
        for(int j=1;j<size;j++){
            if(arr[a]>arr[j]){
             min=arr[a];
             arr[a]=arr[j];
             arr[j]=min;
            }
            }
        }
            System.out.println("Min:"+arr[0]);
        


    }
}
