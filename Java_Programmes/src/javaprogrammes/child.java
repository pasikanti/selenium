package javaprogrammes;

public class child extends Parent {
	
	public void method3()
	{
		
	}
	
	public  void m1() {
		System.out.println("child static overriding");
	
	}
	public static void main(String[] args) {
		child c = new child();
		Parent p = new child();
		p.m1();
		
		c.m1();
		
		
		
	}

}
