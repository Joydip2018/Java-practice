package threading;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleIe extends browserAutomation implements Runnable 
{
    public void run() 
    {
    	WebDriverManager.iedriver().setup();
        try {
            WebDriver driver = new InternetExplorerDriver();
            driver.get("https://www.google.com");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}