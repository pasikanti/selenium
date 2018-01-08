package javaprogrammes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Binary_to_Decimal {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Binary Numberonly:");
		int binary = Integer.parseInt(obj.readLine());
		
		int decimal =0;
		int power =0;
		
		while (binary!=0) 
		{
			int temp = binary%10;
			decimal = (int) (decimal+temp*Math.pow(2, power));
			binary =binary/10;
			power=power+1;
		}
		
		System.out.println(decimal);
			
		}
		
}
