package collection_prog;

import java.util.*;  
public class Collectionprg
{  
	public void Collectionexam()
	{
		int a[]={1,3,4,2,5,7,10,6};
		ArrayList<Integer> al=new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++)
		{
			al.add(new Integer(a[i]));
		} 
		/*ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.add(1);
		al2.add(9);
		al2.addAll(1, al);*/
		
		System.out.println(al.get(3));
		
		/*Iterator<Integer> itr=al.iterator();  
		while(itr.hasNext())
		{  
			System.out.println(String.valueOf(itr.next()));  
		}*/
		//System.out.println(al.get(a.length-2)); 
	}
	
	public void intsort()
	{
		int a[]={1,3,4,2,5,7,10,6};
		ArrayList<Integer> al=new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++)
		{
			al.add(new Integer(a[i]));
		}
		Collections.sort(al,Collections.reverseOrder());  
		Iterator<Integer> itr=al.iterator();  
		while(itr.hasNext())
		{  
			System.out.println(String.valueOf(itr.next()));  
		}
		//System.out.println(al.get(a.length-2)); 
	}
	public void stringsort()
	{
		String a[]={"A","B","F","C","Z"};
		ArrayList<String> al=new ArrayList<String>();
		for (int i = 0; i < a.length; i++)
		{
		al.add(new String(a[i]));
		}
		Collections.sort(al);  
		/*Iterator itr=al.iterator();  
		while(itr.hasNext())
		{  
			System.out.println(String.valueOf(itr.next()));  
		}*/
		System.out.println(al.get(a.length-2)); 	
	}
	public void Maxstring()
	{
		String a[]={"A","B","F","C","Z"};
		ArrayList<String> al=new ArrayList<String>();
		for (int i = 0; i < a.length; i++)
		{
			al.add(new String(a[i]));
		}
		String str=Collections.max(al);  
		System.out.println(str); 	
	}
	public void Minstring()
	{
		String a[]={"A","B","F","C","Z"};
		ArrayList<String> al=new ArrayList<String>();
		for (int i = 0; i < a.length; i++)
		{
			al.add(new String(a[i]));
		}
		String str=Collections.min(al);  
		System.out.println(str); 	
	}
	public void removeduplicatechar()
	{
		String s="asasdasdes";
		char []z=s.toCharArray();
		ArrayList<Character> al=new ArrayList<Character>();
		for (char arr:z)
		{
			al.add(arr);
		}
		HashSet<Object> HS=new  HashSet<Object>(al);
		System.out.println(HS); 	
	}
	public static void main(String args[])
	{  
		Collectionprg C =new Collectionprg();
		C.Collectionexam();
		//C.stringsort();
	}  
}  