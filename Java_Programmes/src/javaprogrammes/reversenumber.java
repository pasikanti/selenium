package javaprogrammes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class reversenumber {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number: ");
		int num = Integer.parseInt(obj.readLine());
		
		int reverse =0;
		
		while (num!=0)
		{
			reverse = reverse*10+(num%10);
			num= num/10;
			
		}
		System.out.println("Reverse Number: "+reverse);
		
		
		
		
		
		
		
	}

}
