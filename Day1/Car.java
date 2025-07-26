public class Car {
    String brand;
    int year;
    void info(){
        System.out.println("Brand:"+brand);
        System.out.println("year:"+year);
    }
    public static void main(String[] args) {
        Car C1=new Car();
        C1.brand="BMW";
        C1.year=2015;
        C1.info();
    }
}
