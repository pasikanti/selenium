package Selenium;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpression_Pattern_matcher {
	
	public static boolean regex(String pattern,String matcher)
	{
		// Creating Pattern Object*******************//
		Pattern r= Pattern.compile(pattern);
		Matcher m = r.matcher(matcher);
		
		if (m.matches())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		boolean res = regex("gpi", "gopi");
		System.out.println(res);
	}

}
