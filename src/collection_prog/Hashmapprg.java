package collection_prog;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Hashmapprg 
{
	public void Readhashmap()
	{
		String s="asasdasdes";
		HashMap<Integer, Character> HP=new HashMap<Integer, Character>();
		char []a=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			HP.put(i,a[i]);
		}
		
		System.out.println("joy:" +HP);
	}
	public void Countduplicate()
	{
		String s="asasdasdes";
		HashMap<Character, Integer> HP=new HashMap<Character, Integer>();
		char []a=s.toCharArray();
		for(char ar:a)
		{
			if(Character.isAlphabetic(ar))
			{
				if(HP.containsKey(ar))
				{
					HP.put(ar, HP.get(ar)+1);
				}
				else
				{
					HP.put(ar,1);
				}
			}
		}
		System.out.println(HP);
	}
	
	public void Removeduplicate()
	{
		String s="asasdasdes";
		char []arr=s.toCharArray();
		HashMap<Integer, Character> HP= new HashMap<Integer, Character>();
		for(int i=0;i<arr.length; i++)
		{
			HP.put(i, arr[i]);
		}
		Set<Object> UV=new HashSet<Object>(HP.values());
		System.out.println(UV.toString());
	}
	
	public static void main(String []args)
	{
		Hashmapprg HPP=new Hashmapprg();
		HPP.Readhashmap();
	}
}
