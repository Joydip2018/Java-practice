package basic_prog;

public class Sorting
{
	public static void main(String []args)
	{
	   int a[]={10,2,1,6,9,5,0,3};
	   for(int i=0;i<a.length-1;i++)
	   {
	      	for(int j=0;j<a.length-1;j++)
	       	{
	       		if(a[j]>a[j+1])
	       		{
	       			int temp=a[j+1];
	       			a[j+1]=a[j];
	       			a[j]=temp;
	       		}
	        }
	    }
	    System.out.println("Second Highest : "+a[a.length-2]);
	    for(int i=0;i<a.length;i++)
	    {
	        System.out.print(a[i]+" ");
        }	    	        
    }

}
