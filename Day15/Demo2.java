import java.util.Scanner;
public class Demo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of x:");
        int x=sc.nextInt();
        System.out.print("Enter the value of y:");
        int y=sc.nextInt();
        int s=0;
        for(int i=1;i<y+1;i++){
            s=x*i;
            System.out.println(s);
        }
    }
}
