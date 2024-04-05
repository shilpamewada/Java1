package Vairables;

class Sample{
	private int a,b;                                      //Instance 
	
	public Sample(){
		System.out.println("Hi!this is Constructor");
	}
	
	public Sample(int a,int b){                           //Local
		System.out.println("Hi!this is Parameterized Constructor");
		this.a = a;
		this.b = b;
	}
	
	public void read(int a,int b){                           //Local
		
		this.a = a;
		this.b = b;
	}
	
	public void show(){
		System.out.println(a);
		System.out.println(b);
	}
	
	public void sum(){
		System.out.println(a + b);
		
	}
}

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample obj1 = new Sample();
		obj1.read(10,20);
		obj1.show();
		obj1.sum();
		
		Sample obj2 = new Sample(100,200);
		obj2.show();
		obj2.sum();

	}

}