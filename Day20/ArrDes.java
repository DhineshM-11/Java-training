package Day20;
import java.util.*;
public class ArrDes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size:");
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int j=size-1;j>=0;j--){
            System.out.print(arr[j]+" ");
        }

    }

}

