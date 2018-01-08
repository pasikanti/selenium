package javaprogrammes;

public class Encapsulation {
	private  String empname;
	
	public String getempname()
	{
		return empname;
	}
	
	public  void setempname(String name)
	{
		empname = name;
	}
	
	public static void main(String[] args) {
		
		Encapsulation t = new Encapsulation();
		t.setempname("gopi");
		System.out.println(t.getempname());
		
		
	}

}
