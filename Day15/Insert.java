import java.util.*;
public class Insert {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr=new int[5];
        arr[0]=3;
        arr[1]=4;
        arr[2]=9;
        arr[3]=12;
        arr[4]=10;
       // System.out.println(arr.length);
       int indx=2;
        for(int i=arr.length-1;i>indx;i--){
            arr[i]=arr[i-1];

        }
        arr[2]=70;
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);

        }

       
       
    }
}
