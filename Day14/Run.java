package Day14;
class A2 implements Runnable{
    int j=0;
   public void run(){
    for(int i=0;i<=20;i++){
        j=i;
    }
    }
}
public class Run {
    public static void main(String[] args) {
        A2 a2=new A2();
        Thread t1=new Thread(a2);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(a2.j);
    }
}
