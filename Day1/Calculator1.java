public class Calculator1 {
    int a,b;
    void add(){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Calculator1 cal=new Calculator1();
        cal.a=20;
        cal.b=5;
        cal.add();
    }
}
