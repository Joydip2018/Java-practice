package threading;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleFirefox extends browserAutomation implements Runnable 
{

    public void run() 
    {
    	WebDriverManager.firefoxdriver().setup();
        try {
            FirefoxOptions options = new FirefoxOptions();
            options.setLogLevel(FirefoxDriverLogLevel.DEBUG);
            WebDriver driver = new FirefoxDriver(options);
            driver.get("https://www.google.com");
        } catch (Exception e) {
            System.out.println();
        }
    }
}
