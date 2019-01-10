package NaveenAutomation;

public class RemoveJunk {

	public static void main(String[] args) 
	{
		String s="@#$ %^& Hi this IS Srikanth";
		s=s.replaceAll("[^A-Z]", "");
		System.out.println(s);
	}

}
