import java.util.ArrayList;
class arraylist{
    public static void main(String[]args){
        ArrayList<String> cars=new ArrayList<>();
        cars.add("Tesla");
        cars.add("Tata");
        cars.add("BMW");
        System.out.println(cars.size());
        System.out.println(cars.get(2));
        System.out.println(cars);
    }
}