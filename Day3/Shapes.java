public class Shapes {
	double length,breadth;
	Shapes(double len,double breadth){
		this.length=len;
		this.breadth=breadth;
		
	}
	void check() {
		if(length==breadth) {
			System.out.println("Length:"+length);
			System.out.println("Breadth:"+breadth);
			System.out.println("Square");
		}
		else {
			System.out.println("Length:"+length);
			System.out.println("Breadth:"+breadth);
		System.out.println("Rectangle");
		}
	}
	public static void main(String []args) {
		Shapes s1=new Shapes(23,34);
		Shapes s2=new Shapes(3.3,3.3);
		s1.check();
		s2.check();
		
	}
}
