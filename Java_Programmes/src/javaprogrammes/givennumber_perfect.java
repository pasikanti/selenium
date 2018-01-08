package javaprogrammes;

import java.util.Scanner;

public class givennumber_perfect {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Number:");
	
	int num = scan.nextInt();
	
	int temp =0;
	for (int i=1; i<=num/2; i++)
	{
		if(num%i==0)
		{
			temp+=i;
		}
	}
	
	if(temp==num)
	{
		System.out.println("Given is Perfect Number");
	}
	else
	{
		System.out.println("Given Number is Not Perfect");
	}
			
	}
	
}
