package Day23;
import java.util.*;
public class SeriesNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int n=1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i>=j){
                    System.out.print(n++ +" ");
                    
                }
            }
            System.out.println();
        }
    }
}
