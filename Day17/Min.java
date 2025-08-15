package Day17;
import java.util.Scanner;
public class Min {
     public int min(int arr[],int size,int a){
        for(int j=1;j<size;j++){
            if(a>arr[j]){
                a=arr[j];
            }
        } return a;

     }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array element:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Min m=new Min();
        int a=arr[0];
        int min1=m.min(arr,size,a);
        System.out.println("Min:"+min1);
     }
}
