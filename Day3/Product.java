public class Product {
	String name,category;
	int price;
	double a;
	Product(String name,String category,int price){
		this.name=name;
		this.category=category;
		this.price=price;
		
	}
	void GST() {
		if(category.equalsIgnoreCase("Electronics")) {
			 a=(18.0/100)*price;
			 a=price+a;
			System.out.println("Name:"+name);
			System.out.println("Price:"+price);
			System.out.println("Gst 18% Total price:"+a);
		}
		else if(category.equalsIgnoreCase("Groceries")) {
			 a=price*(5.0/100);
			 a=price+a;
			 System.out.println("Name:"+name);
			 System.out.println("Price:"+price);
			 System.out.println("Gst 5% Total price:"+a);
		}
		else if (category.equalsIgnoreCase("clothes")){
			a=price*(12.0/100);
			 a=price+a;
			 System.out.println("Name:"+name);
			 System.out.println("Price:"+price);
			 System.out.println("Gst 12% Total price:"+a);
		}
		else {
			System.out.println("Invalid");
		}
	}
	public static void main(String []args) {
		Product p1=new Product("Switch","electronics",100);
		Product p2=new Product("Shirt","clothes",850);
		Product p3=new Product("Rice","Groceries",250);
		p1.GST();
		System.out.println(" ");
		p2.GST();
		System.out.println(" ");
		p3.GST();
		
	}
}
