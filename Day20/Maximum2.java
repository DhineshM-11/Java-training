package Day20;
import java.util.*;
public class Maximum2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of the Array:");
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int x=0;x>size;x++){
            for(int y=1;y<size;y++){
             if(arr[x]>arr[y]){
                int temp=arr[x];
                arr[x]=arr[y];
                arr[y]=temp;
             }
        }
    }
        System.out.println("Max:"+arr[1]);

    }
}
