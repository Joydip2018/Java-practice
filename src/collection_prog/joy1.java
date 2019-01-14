package collection_prog;

import java.util.HashMap;
import java.util.Scanner;

public class joy1
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter an integer");
		int a = keyboard.nextInt();
		String str="";
		String d=String.valueOf(a);
		char []c= d.toCharArray();
		
		String []s={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine",
				"Hundred","Thousand","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy",
				"Eighty","Ninety"};
		HashMap<Integer, String> HP=new HashMap<Integer, String>();
		HP.put(0, s[0]);
		HP.put(1, s[1]);
		HP.put(2, s[2]);
		HP.put(3, s[3]);
		HP.put(4, s[4]);
		HP.put(5, s[5]);
		HP.put(6, s[6]);
		HP.put(7, s[7]);
		HP.put(8, s[8]);
		HP.put(9, s[9]);
		HP.put(100, s[10]);
		HP.put(1000, s[11]);
		HP.put(20, s[12]);	
		HP.put(30, s[13]);
		HP.put(40, s[14]);
		HP.put(50, s[15]);
		HP.put(60, s[16]);
		HP.put(70, s[17]);
		HP.put(80, s[18]);
		HP.put(90, s[19]);
		
		int count=c.length;
		for(int i=0; i<c.length; i++)
		{
			int z=Character.getNumericValue(c[i]);
			if(count==4)
			{
				str=str+" "+HP.get(z)+" "+HP.get(1000);
				count--;
				continue;
			}
			if(count==3)
			{				
				if(z>0)
				{
					str=str+" "+HP.get(z)+" "+HP.get(100);
				}				
				count--;
				continue;
			}
			if(count==2)
			{
				if(z!=0)
				{
					if(z>1)
					{
						str=str+" "+HP.get(Integer.valueOf(String.valueOf(z)+String.valueOf(0)));
					}					
				}				
				count--;
				continue;
			}
			if(count==1)
			{
				if(z!=0)
				{
					str=str+" "+HP.get(z);
				}
				count--;
				continue;
			}
		}
		System.out.println(a +" =" +str);		
	}
}
