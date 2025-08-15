package Day17;
import java.util.*;
import java.util.Scanner;
public class Search {
    
    public int searchElement(int arr[],int search,int size){
        for(int j=0;j<size;j++){
            if(arr[j]==search){
                return j;
            }
            
        }return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size=sc.nextInt();
         int[]arr=new int[size];
        System.out.print("Enter the element "+size+" to be insert:");

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Element is inserted ");
        
        System.out.print("Enter the element to be search:");
        int search=sc.nextInt();
        //int index=0;
        Search s=new Search();
        int a=s.searchElement(arr,search,size);
        if(a!=-1){
        System.out.println("Search element is found at index of :"+a);
        }
        else{
            System.out.println("Search is not found");
        }

    }
}
