package threading;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleChrome extends browserAutomation implements Runnable 
{
    public void run() 
    {
    	WebDriverManager.chromedriver().setup();
        try 
        {
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com");
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}
