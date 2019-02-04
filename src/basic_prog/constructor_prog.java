package basic_prog;

public class constructor_prog {

	public constructor_prog() 
	{
		System.out.println("Joy");
	}
	public constructor_prog(int i) 
	{
		System.out.println("Dip");
	}
	
	public void chk()
	{
		System.out.println("Bhattachajee");
	}

	public static void main(String[] args) 
	{
		//call only those constructor for which object is created.
		//First run this code without any changes than comment the first line and uncomment the second one. 
		constructor_prog pr=new constructor_prog();
		//constructor_prog pr=new constructor_prog(1);
		pr.chk();
	}
}
