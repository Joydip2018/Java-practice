package collection_prog;

public class name 
{
	static int count=1;
	static void joy()
	{
		if(count<=5)
		{
			System.out.println("Joy");
			count++;
			joy();
		}
	}
	public static void main(String []args)
	{
		joy();
	}

}
