package Day14;
class A1 extends Thread{
    int e=1;
   public void run(){
    for(int i=0;i<=10;i++){
      e=i;
   }
   } 
}
public class join {
    public static void main(String[] args) {
        A1 a1=new A1();
        
        a1.start();
        try {
            a1.join();
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
        System.out.println(a1.e);
    }
}
