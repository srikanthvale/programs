package NaveenAutomation;

public class DuplicateNumbers {

	public static void main(String[] args) 
	{
		int obj[]= {1,2,2,3,5,4,5};
		
		for(int i=0;i<obj.length;i++)
		{
			for(int j=i+1;j<obj.length;j++)
			{
				if(obj[i]==obj[j])
				{
					System.out.print("Duplicate numbers :"+obj[j]);
				}
			}
		}
		

	}

}
