package javaprogrammes;

import java.util.Scanner;

public class decimal_to_binary {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number :");
		int number = scan.nextInt();
		
		int [] binary = new int[25];
		int index =0;
		
		while (number>0)
		{
			binary[index++] = number%2;
			number = number/2;
			}
		for (int i=index-1; i>=0; i--)
		{
			System.out.print(binary[i]);
		}
		
			
			
			
			
			
		}
	}


