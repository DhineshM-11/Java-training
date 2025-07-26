package hello;

public class Laptop {
    String brand,RAM;
     
    void ShowConfiguration(){
        System.out.println("Brand:"+brand);
        System.out.println("RAM:"+RAM);
    }

    public static void main(String[] args) {
        Laptop l1=new Laptop();
        l1.brand="HP";
        l1.RAM="16GB";
        l1.ShowConfiguration();
    }
}
