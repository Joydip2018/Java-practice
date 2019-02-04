package basic_prog;

public class pattern_prog 
{

	//	* 
	//	* * 
	//	* * * 
	//	* * * * 
	//	* * * * *
	public static void pattern1()
	{
		int i, j; 		  
        for(i=0; i<5; i++) 
        {       
            for(j=0; j<=i; j++) 
            { 
                System.out.print("* "); 
            }             
            System.out.println(); 
        } 
	}
	
	//    	    *
	// 	      * * 
	//	    * * * 
	// 	  * * * * 
	//  * * * * * 
	public static void pattern2()
	{
		int i, j, n=5; 		  
        for(i=0; i<n; i++) 
        {         	                 
            for(j=n-i; j>=0; j--) 
            {                 
                System.out.print(" "); 
            }                                         
            for(j=0; j<=i; j++) 
            { 
                System.out.print("*"); 
            }                         
            System.out.println(); 
        } 
	}

	//	* * * * *
	//	  * * * *
	//	    * * *
	//	      * *
	//	        *
	public static void pattern3()
	{
		int i, j, n=5; 		  		
		for(i=0; i<n; i++) 
		{ 			 		        
		    for(j=(n-i); j>0; j--) 
		    { 		        
		        System.out.print("*"); 
		    }  
		    System.out.println();		    		        
		    for(j=0; j<=i; j++) 
		    { 		        
		        System.out.print(" "); 
		    }              		    
		} 
	}
	
	//      *
	//	   * * 
	//	  * * * 
	//	 * * * * 
	//	* * * * * 
	public static void pattern4()
	{
		int i, j, n=5; 		  		 
		for(i=0; i<n; i++) 
		{ 			 		       
		    for(j=(n-i); j>=0; j--) 
		    { 		        
		        System.out.print(" "); 
		    }             		    		        
		    for(j=0; j<=i; j++) 
		    { 		         
		        System.out.print(" *"); 
		    }              		    
		    System.out.println(); 
		} 
	}
	
	//    	*
	// 	   * * 
	//    * * * 
	//   * * * * 
	//  * * * * *
	//	 * * * *
	//	  * * *
	//	   * *
	//	    *
	public static void pattern5()
	{
		int i, j, n=5; 		  		 
		for(i=0; i<n; i++) 
		{ 			 		       
		    for(j=(n-i); j>0; j--) 
		    { 		        
		        System.out.print(" *"); 
		    }  
		    System.out.println();		    		        
		    for(j=0; j<=i; j++) 
		    { 		         
		        System.out.print(" "); 
		    }              		    
		    //System.out.println(); 
		} 
	}
	
	//  * * * * *
	//	 * * * *
	//	  * * *
	//	   * *
	//	    *
	public static void pattern6()
	{
		int i, j, n=5,l; 	
		l=n-1;		
		for(i=0; i<n; i++) 
		{ 			 		       
		    for(j=n-i; j>1; j--) 
		    { 		       
		        System.out.print(" "); 
		    }             		    		        
		    for(j=0; j<=i; j++) 
		    { 		         
		        System.out.print(" *"); 
		    }             		    
		    System.out.println(); 
		} 		
		for(i=0; i<l; i++) 
		{ 		      
			for(j=0; j<=i; j++) 
		    {
		        System.out.print(" "); 
		    }   
		    for(j=(l-i); j>0; j--) 
		    {   
		        System.out.print(" *"); 
		    }  
		    System.out.println();               
		} 
	}
	
	// 	1
	//  1 2
	//  1 2 3
	//  1 2 3 4
	//  1 2 3 4 5
	public static void pattern7()
	{
		int i, j; 		  
        for(i=1; i<=5; i++) 
        {       
            for(j=1; j<=i; j++) 
            { 
                System.out.print(" "+j); 
            }             
            System.out.println(); 
        } 
	}
	
	//	1 
	//	2 3 
	//	4 5 6 
	//	7 8 9 10
	public static void pattern8()
	{
		int i, j,k=1; 		  
        for(i=1; i<5; i++) 
        {       
            for(j=1; j<=i; j++) 
            { 
                System.out.print(k+" ");
                k++;
            }             
            System.out.println(); 
        } 
	}
	
	public static void main(String[] args) 
	{
		pattern6();
	}

}
