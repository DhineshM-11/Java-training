package Day17;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size:");
        int size=sc.nextInt();
        int []arr=new int[size];
        
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
       int  max=arr[0];
        Sum s1=new Sum();
       int a= s1.Max1(arr,size,max);
       

    }
     public int Max1(int [],size,max){
        for(int j=0;j<size;j++){
            if(max<arr[j+1]){
                max=arr[j+1];
            }
            

        }return max;
    }
}
