package javaprogrammes;

public class StringClass {
	public static void main(String[] args) {
		
		String s ="pasi&43kan*ti321%abcd ";
		String regex = "((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))";
		String []a = s.split("\\d");
		String k = "pasi&43kan*ti321%abcd ";
		int m = 200;
		int n = Integer.parseInt(s);
		
		if(k==s)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		System.out.println(a[5]);
		
/*	System.out.println(s.length());
	System.out.println(s.substring(0,3));
	System.out.println(s.trim());
	System.out.println(s.charAt(0));
	System.out.println(s.valueOf(32121).length());
	System.out.println(s.replace("p", "c"));
	System.out.println(s);*/
		
		
		
		
		
	}

}
