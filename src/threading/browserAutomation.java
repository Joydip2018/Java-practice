package threading;

public class browserAutomation
{
    public static void main(String[] args) 
    {
        Thread googleFirefox = new Thread(new GoogleFirefox());
        googleFirefox.start();
        Thread googleIE = new Thread(new GoogleIe());
        googleIE.start();
        Thread googleChrome = new Thread(new GoogleChrome());
        googleChrome.start();
    }
}