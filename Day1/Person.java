class Person{
    String Name;
    int Age; 
    void display(){
        System.out.println("Name:"+Name);
        System.out.println("Age:"+Age);
    }
public static void main(String []args){
        Person P1=new Person();
        P1.Name="Vijay";
        P1.Age=28;
        P1.display();
    }
}
