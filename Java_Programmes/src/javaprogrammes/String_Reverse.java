package javaprogrammes;

import java.util.concurrent.SynchronousQueue;

public class String_Reverse {
	public static void main(String[] args) {
		String s = "Pasikanti and Gopi valueLabs";
		String []a=s.split(" ");
		System.out.println(a.length);
	 
		//System.out.println(a.length);
		for(int i=0; i<a.length;i++)
		{
			String temp = a[i];
			//System.out.println(temp.length());
			String k ="";
			for(int j=temp.length()-1; j>=0; j--)
			{
				k=k+temp.charAt(j);
			}
			System.out.print(k+" ");
			
		}
	}

}
