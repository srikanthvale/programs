package NaveenAutomation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ToGetWordFromText {

	public static void main(String[] args) 
	{
		String x="My name Is Srikanth";
		Pattern p=Pattern.compile("[A-Z][a-z]+");
		Matcher m=p.matcher(x);
		while(m.find())
		{
			System.out.print(m.group());
		}
		

	}

}
