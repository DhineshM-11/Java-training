import java.util.Scanner;

public class Book {
	String title,category;
	int price;
	double a;
	Book(String title,String category,int price){
		this.title=title;
		this.category=category;
		this.price=price;
		
	}
	void discount() {
		System.out.println("Title:"+title);
		System.out.println("Price:"+price);
		
		if(category=="fiction"|| category=="Fiction") {
			 a=(10.0/100)*price;
			 a=price-a;
			System.out.println("Fiction Book Price after discount:"+a);
		}
		else if(category=="Education"||category=="education") {
			 a=price*(20.0/100);
			 a=price-a;
			System.out.println("Education Book Price after discount:"+a);
		}
		else {
			System.out.println("No discount");
		}
		System.out.println("");
	}
	public static void main(String []args) {
		Book b2=new Book("MonkeyBall","Fiction",500);
		Book b3=new Book("Java","Education",1000);
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Type of book for discount:");
		String s= sc.nextLine();*/
		b2.discount();
		b3.discount();
		
	}
}
