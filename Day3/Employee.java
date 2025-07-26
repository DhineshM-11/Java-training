public class Employee {
	int emp_id,salary;
	String name;
	double a;
	Employee(String name,int id,int salary){
		this.name=name;
		this.emp_id=id;
		this.salary=salary;
	}
	void  bonus() {
		if(salary>5000) {
			a=salary*(10.0/100);
			System.out.println("Name:"+name);
			System.out.println("Employee id:"+emp_id);
			System.out.println("Bonus Amount is increased my 10%:"+a);
			System.out.println("");
		}
		else {
			a=salary*(5.0/100);
			System.out.println("Name:"+name);
			System.out.println("Employee id:"+emp_id);
			System.out.println("Bonus Amount is increased by 20%:"+a);
		}
	}
	public static void main(String []args) {
		Employee e1=new Employee("Ajith",4231,30000);
		Employee e2=new Employee("Vijay",2341,3400);
		e1.bonus();
		e2.bonus();
	}
}