import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by akshay.chimote on 05-01-2017.
 */

public class DemoOfMaven {
    @Test
    public void testGmail()
    {

        System.out.println("**Akshay**");
        WebDriver driver = null;
        try{

            System.setProperty("webdriver.chrome.driver", "C:\\Eclipse Automation\\chrome prerequisites\\chromedriver.exe");

            driver = new ChromeDriver();

            // And now use this to visit Google
            driver.get("http://www.gmail.com");
            WebElement element = driver.findElement(By.id("Email"));
            element.sendKeys("connectwithme11@gmail.com");
            driver.findElement(By.id("next")).click();
        /*driver.findElement(By.id("Passwd")).sendKeys("Akshay11");
        driver.findElement(By.id("signIn")).click();
        driver.navigate().to("https://www.google.co.in/intl/en/options/");*/
            driver.navigate().back();
            Assert.assertTrue(true);
            driver.quit();
        }
        catch(Exception e)
        {
            driver.quit();
        }
    }

}
