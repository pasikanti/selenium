package javaprogrammes;

public class GivenNum_PrimeOr_Not {
	final public synchronized strictfp  static void main(String... args) {
		int num= 19;
		int counter =0;
		for(int i=1; i<=num; i++)
		{
			
			if(num%i==0)
			{
				counter =counter+1;
			}
		}
		
		if (counter==2)
		{
			System.out.println("Give number is PRIME");
		}
		else
		{
			System.out.println("Given number is NOT Prime");
		}
		
		
	}

}
