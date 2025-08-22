package Day23;
import java.util.*;
public class DuplicateNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size:");
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int x=0;x<size;x++){
            for(int y=x+1;y<size;y++){
                if(arr[x]==arr[y]){
                    System.out.print(arr[x]);
                    
                }
            }
        }
    }
}
