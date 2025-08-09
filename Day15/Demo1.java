import java.util.*;
class Demo{
    public int[] array(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the element:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<size;j++){
            System.out.println(arr[j]);
        }
        return arr;
    }
}
public class Demo1 {
    public static void main(String[] args) {
    
    Demo d=new Demo();
    int[]arr=d.array();
    System.out.println(arr);

    }

}
