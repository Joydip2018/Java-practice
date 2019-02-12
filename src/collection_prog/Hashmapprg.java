package collection_prog;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmapprg 
{
	@SuppressWarnings({"rawtypes", "unchecked" })
	public void mapexample()
	{
		/*HashMap map=new HashMap();  
	    //Adding elements to map  
	    map.put(1,"Amit");  
	    map.put(5,"Rahul");  
	    map.put(2,"Jai");  
	    map.put(6,"Amit");
	    System.out.println(map);
	    //Traversing Map  
		Set set=map.entrySet();//Converting to Set so that we can traverse  
		System.out.println(set);
	    Iterator itr=set.iterator();  
	    while(itr.hasNext()){  
	        //Converting to Map.Entry so that we can get key and value separately  
	        Map.Entry entry=(Map.Entry)itr.next();  
	        System.out.println(entry.getKey()+" "+entry.getValue());  
	    }  */
		
		  Map<Integer,String> map=new HashMap<Integer,String>();  
		  map.put(100,"Amit");  
		  map.put(105,"Vijay");  
		  map.put(102,"Rahul");  
		  //Elements can traverse in any order  
		  for(Map.Entry m:map.entrySet())
		  {
			  System.out.println(m.getKey()+" "+m.getValue());  
		  }  
	} 
	
	@SuppressWarnings("rawtypes")
	public void mapexample1()
	{
		   HashMap<Integer,String> hm=new HashMap<Integer,String>();    
		   System.out.println("Initial list of elements: "+hm);  
		   hm.put(100,"Amit");    
		   hm.put(101,"Vijay");    
		   hm.put(102,"Rahul");   
		       
		   System.out.println("After invoking put() method ");  
		   for(Map.Entry m:hm.entrySet())
		   {
			   System.out.println(m.getKey()+" "+m.getValue());    
		   }  
		        
		   hm.putIfAbsent(103, "Gaurav");  
		   System.out.println("After invoking putIfAbsent() method ");  
		   for(Map.Entry m:hm.entrySet())
		   {
			   System.out.println(m.getKey()+" "+m.getValue());    
		   }  
		   HashMap<Integer,String> map=new HashMap<Integer,String>();  
		   map.put(104,"Ravi");  
		   map.putAll(hm);  
		   System.out.println("After invoking putAll() method ");  
		   for(Map.Entry m:map.entrySet())
		   {    
		        System.out.println(m.getKey()+" "+m.getValue());    
		   }  
	}
	
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
