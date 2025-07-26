public class Student {
    String name;
    int roll_no;
    void detail(){
        System.out.println("Name:"+name);
        System.out.println("Roll Number:"+roll_no);
    }
    public static void main(String[] args) {
        Student S1=new Student();
        S1.name="John";
        S1.roll_no=401822;
        S1.detail();
    }
}
