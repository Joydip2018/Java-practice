package string_prog;

import java.util.*;  
public class String_manipulation
{  
	public void stringsort()
	{
		char a[]={'A','B','F','C','Z'};
		Arrays.sort(a);
		String str= new String(a);
		System.out.println(str); 	
	}
	public void stringreverse()
	{
		String a="joydip";
		char []z=a.toCharArray();
		for (int i = z.length-1; i >= 0; i--)
		{
			System.out.print(z[i]);
		}
		 	
	}
	public void removeduplicatechar()
	{
		String s = "joydipjoydipdipjoy";
        String s2 = "";
        for (int i = 0; i < s.length(); i++) 
        {
            Boolean found = false;
            for (int j = 0; j < s2.length(); j++) 
            {
                if (s.charAt(i) == s2.charAt(j)) 
                {
                    found = true;
                    break; //don't need to iterate further
                }
            }
            if (found == false)
            {
                s2 = s2.concat(String.valueOf(s.charAt(i)));
            }
        }
        System.out.println(s2);
    }
	public void countduplicatechar()
	{
		char Char;
	    int count;
	    String a = "joyjoyjoy";
	    a = a.toLowerCase();
	    for (Char = 'a'; Char <= 'z'; Char++) 
	    {
	        count = 0;
	        for (int i = 0; i < a.length(); i++)
	        {
	            if (a.charAt(i) == Char)
	            {
	                count++;
	            }
	        }
	        if(count>0)
	        {
	        System.out.println("Number of occurences of " + Char + " is " + count);
	        }
	    }
    }
	public static void main(String args[])
	{  
		String_manipulation C =new String_manipulation();
		C.countduplicatechar();
		//C.stringsort();
	}  
}  