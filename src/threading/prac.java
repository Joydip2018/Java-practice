package threading;

public class prac extends Thread
{   
	int time;
	String str;
	public prac(int Time, String st)
	{
		this.time=Time;
		this.str=st;
	}
    public void run()  
    {    
        for(int i=1;i<5;i++)  
        {    
            try
            {  
                Thread.sleep(time);  
            }
            catch(InterruptedException e)
            {
            	System.out.println(e);
            }            
            System.out.println(Thread.currentThread().getName()+" "+str+" "+i);    
        }    
    }
    public static void main(String args[])throws InterruptedException, SecurityException
    {    
    	prac t1=new prac(500,"T1");    
    	prac t2=new prac(200,"T2");    
    	prac t3=new prac(300,"T3");
        t1.start();
        // starts second thread when first thread t1 is died. 
        try  
        {    
            t1.join();    
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }   
        // start t2 and t3 thread   
        t2.start();  
        // suspend t2 thread   
        t2.suspend();   
        t3.start(); 
        // resume t2 thread 
        t2.resume();  
        // stop t3 thread   
        t3.stop();  
        System.out.println("Thread t3 is stopped");    
        t1.destroy();
        System.out.println(t1.getName() + " destroyed");
    }    
}  