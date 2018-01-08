package javaprogrammes;

import java.util.Scanner;

public class nxn_martrix_diagonal_sum {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Value matrix n:");
		
		int n = scan.nextInt();
		int id =0;
		
		int [][]a = new int [n][n];
		
		for (int i=0; i<n; i++)
		{
		for (int j=0; j<n; j++)
		{
			System.out.println("Enter Data for Matrix;");
			
			a[i][j] = scan.nextInt();
			
		}
		}
	// Adding Diagonal Numbers*************************//
		for (int i=0; i<n; i++)
		{
		
				id = id+ a[i][i];
		}
			
		
		
		System.out.println(id);
		System.out.println(a[2][1]);
		
		
		
	}

}
