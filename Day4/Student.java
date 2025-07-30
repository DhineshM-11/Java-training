import java.util.Scanner;


public class Student {
	String name;
	int rollno;
	Student(String name,int rollno){
		this.name=name;
		this.rollno=rollno;
		System.out.println("Name:"+name);
		System.out.println("Rool No:"+rollno);
	}
	void calculateGrade() {
		System.out.println("Total mark out of 100");
	}
	void calculateGrade(int a,int b,int c)
	{
		double C=(a+b+c)/3;
		if(C>=90) {
			System.out.println("A+");
		}
		else if(C>=80) {
			System.out.println("A");
		}
		else if(C>=70) {
			System.out.println("B+");
		}
		else if(C>=60) {
			System.out.println("B");
		}
		else {
			System.out.println("C");
		}
		
	}
	void calculateGrade(double a) {
		if(a>=9.0 && a<=10.0) {
			System.out.println("Grade is:A+");
		}
		else if(a>=8.0 && a<9.0) {
			System.out.println("Grade is :A");
		}
		else if(a>=7.0 && a<8.0) {
			System.out.println("Grade is:B+");
		}
		else if(a>=6.0 && a<7.0) {
			System.out.println("Grade is:B");
		}
		else if(a<6.0) {
			System.out.println("Grade is:C");
		}
		else {
			System.out.println("Enter the grade range within 10.0");
		}
	}
	
}

class driver{
	public static void main(String []args) {
		Student s1=new Student("John",4034);
		Scanner sc=new Scanner(System.in);
		s1.calculateGrade();
		System.out.print("Enter the First mark:");
		int a=sc.nextInt();
		System.out.print("Enter the second  mark:");
		int b=sc.nextInt();
		System.out.print("Enter the third  mark:");
		int c=sc.nextInt();
		s1.calculateGrade(a,b,c);
		System.out.print("Enter the gpa: ");
		double d1=sc.nextDouble();
		
		s1.calculateGrade(d1);
		
	}
}