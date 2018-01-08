package javaprogrammes;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputFromUser   {
	public static void main(String [] args) throws Exception {
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter Number:");
	int number = Integer.parseInt(input.readLine());
	
	}
}
