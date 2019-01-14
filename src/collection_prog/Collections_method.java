package collection_prog;

import java.util.*;

public class Collections_method
{  
	public void Reversestring()
	{
		String list="I am the best";
		char []clist=list.toCharArray();
		ArrayList<Character> arr= new ArrayList<Character>();
		for(char a:clist)
		{
			arr.add(a);
		}
		Collections.addAll(arr);
		int az=arr.size()-1;
		for(int i=az;i>=0;i--)
		{
		System.out.print(arr.get(i)); 
		}
	}
	public void Reversestring1()
	{
		String list="I am the best";
		char []clist=list.toCharArray();
		ArrayList<Character> arr= new ArrayList<Character>();
		for(char a:clist)
		{
			arr.add(a);
		}
		Collections.reverse(arr);
		for(int i=0;i<arr.size();i++)
		{
		System.out.print(arr.get(i)); 
		}
	}
	public void BinaryBearch()
	{
		String list="123456789";
		char[]clist=list.toCharArray();
		ArrayList<Integer> arr= new ArrayList<Integer>();
		for(char a:clist)
		{
			int i=Character.getNumericValue(a);
			arr.add(i);
		}
		int index=Collections.binarySearch(arr, 2);
		index =index+1;
		System.out.println("Position of 3 is: " +index);
		
	}
	public void ReplaceString()
	{
		String list="I was the best";
		String []Slist=list.split(" ");
		ArrayList<String> arr= new ArrayList<String>();
		for(String a:Slist)
		{
			arr.add(a);
		}
		Collections.replaceAll(arr, "was", "am");
		for(int i=0;i<arr.size();i++)
		{
		System.out.print(arr.get(i) +" "); 
		}
	}
	public void RotateString()
	{
		String list="I was the best";
		String []Slist=list.split(" ");
		ArrayList<String> arr= new ArrayList<String>();
		for(String a:Slist)
		{
			arr.add(a);
		}
		Collections.rotate(arr, 2);
		for(int i=0;i<arr.size();i++)
		{
		System.out.print(arr.get(i) +" "); 
		}
	}
	 
	public void ShuffleString()
	{
		String list="I am the best";
		String []Slist=list.split(" ");
		ArrayList<String> arr= new ArrayList<String>();
		for(String a:Slist)
		{
			arr.add(a);
		}
		Collections.shuffle(arr);
		for(int i=0;i<arr.size();i++)
		{
		System.out.print(arr.get(i) +" "); 
		}
	}
	
	public void Unmodifiable_List()
	{
		String list="I am the best";
		String []Slist=list.split(" ");
		ArrayList<String> arr= new ArrayList<String>();
		for(String a:Slist)
		{
			arr.add(a);
		}
		List<String> arr1=Collections.unmodifiableList(arr);
		arr.add("joy");
		for(int i=0;i<arr1.size();i++)
		{
		System.out.print(arr1.get(i) +" "); 
		}
	}
	public static void main(String[] args) 
	
	{  
		Collections_method CM=new Collections_method();
		CM.Unmodifiable_List();
    }

 
}  