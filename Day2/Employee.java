
public class Employee {
    String name;
    int salary;
    Employee(String name,int Salary){
        this.name=name;
        this.salary=Salary;
    }
    void display_info(){
        System.out.println("Name:"+name);
        System.out.println("Salary:"+salary);
    }
    public static void main(String[] args) {
        Employee E1=new Employee("John",35000);
        E1.display_info();
    }
    
}
