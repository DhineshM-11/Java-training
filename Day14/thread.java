package Day14;

class A extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
        System.out.println("iam Thread 1");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
           
            e.printStackTrace();
        }
        }
    }

}
class B extends Thread{
    public void run(){
        for(int i=0;i<=15;i++){
        System.out.println("iam thread 2");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
        }
    }
}
public class thread {
    public static void main(String[] args) {
       A a=new A();
       B b=new B();
       //a.run(); 
       a.start();
       b.start();
    }
}
