class Battery{
    void power(){
        System.out.println("battery is providing power");
    }
}
class Mobile{
    Battery b1=new Battery();
    void start(){
        b1.power();
        System.out.println("Mobile get Started");
    }
}


public class HasaRelation {
    public static void main(String[] args) {
        Mobile m1=new Mobile();
        m1.start();
    }
    
}
