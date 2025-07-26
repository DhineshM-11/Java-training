package hello;

public class Pen {
    String color,brand;
    void write(){
        System.out.println("Writing with "+color+" ,pen of "+brand+" brand");
    }
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.color="blue";
        p1.brand="hero";
        p1.write();

    }
}
