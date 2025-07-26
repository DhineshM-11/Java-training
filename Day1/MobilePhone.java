public class MobilePhone {
    String brand;
    int price;
    void ShowSpec(){
        System.out.println("Brand:"+brand);
        System.out.println("Price:"+price);
    }
    public static void main(String[] args) {
        MobilePhone M1=new MobilePhone();
        M1.brand="Samsung";
        M1.price=25000;
        M1.ShowSpec();
    }
}
