package collection_prog;

import java.util.ArrayList;

public class joy2 {

	public static void main(String[] args) 
	{
		int r=13;
		int i,a=1,b=1,c,sum;
		int i1=((r-1)/2)+1;
		ArrayList<Integer> z=new ArrayList<Integer>();
		for(i=0;i<i1;i++)
		{
			sum=0;
			a=a+b;
			c=b;
			b=a;
			a=c;
			z.add(a);
			System.out.println(a);
			for(int j=0; j<z.size(); j++)
			{
				sum = sum+z.get(j);
			}
			a=sum;
		}
		c=z.get(z.size()-1);
		for(i=0;i<i1-1-2;i++)
		{
			c=c/2;
			System.out.println(c);
		}
		for(i=0;i<2;i++)
		{
			c=c-1;
			System.out.println(c);
		}

	}

}
