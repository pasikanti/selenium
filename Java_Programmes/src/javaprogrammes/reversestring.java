package javaprogrammes;

public class reversestring {
	
	public static void main(String[] args) {
		String str = "Pasikanti gopi";
		  String temp = "";
		    int i = str.length();

		    while (i > 0) {
		        temp += str.substring(i-1, i);
		        i--;
		    }

		System.out.println(temp);		
	}

}
