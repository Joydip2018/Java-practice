package collection_prog;

public class GarbageCollector 
{
	public void finalize()
	{
		System.out.println("object is garbage collected");
	}  
	public void Joy()
	{
		System.out.println("I AM THE BEST");
	} 
	public void Joy1()
	{
		System.out.println("JOY IS BACK");
	} 
	public static void main(String args[])
	{  
		GarbageCollector s1=new GarbageCollector();  
		GarbageCollector s2=new GarbageCollector();  
		s1.Joy();  
		s2=null;  
		System.gc();  
		//s1=null;
		s1.Joy1();
	 }  

}
