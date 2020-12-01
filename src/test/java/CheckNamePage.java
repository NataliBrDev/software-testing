import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class CheckNamePage {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "/home/natali/geckodriver/geckodriver");
        DesiredCapabilities dc = DesiredCapabilities.firefox();
        dc.setCapability("marionette", true);
        WebDriver driver = new FirefoxDriver(dc);
        //ChromeDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://litecart.stqa.ru/en/");
        driver.manage().window().maximize();

//a
        driver.findElement(By.xpath("/div[2]/div[2]/div[4]/h3"));
        driver.findElement(By.xpath("//div[4]//ul/li/a[1]/div[2]"));  //name
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div[4]/div/ul/li/a[1]")).click();
        driver.findElement(By.xpath("//div[2]//div[1]/h1"));  //name1
        Assert.assertEquals( driver.findElement(By.xpath("//div[4]//ul/li/a[1]/div[2]")).getText(), driver.findElement(By.xpath("//div[2]//div[1]/h1")).getText() );

        driver.findElement(By.xpath("//div[2]//div[2]/div[2]//nav/ul/li[1]/a")).click();
        //b
        driver.findElement(By.xpath("//div[2]/div[4]//ul/li/a[1]/div[4]/strong"));   //price
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div[4]/div/ul/li/a[1]")).click();
        driver.findElement(By.xpath("//div[2]//div[2]/strong"));     //price 1
        Assert.assertEquals(  driver.findElement(By.xpath("//div[2]/div[4]//ul/li/a[1]/div[4]/strong")).getText(),driver.findElement(By.xpath("//div[2]//div[2]/strong")).getText() );
//v
      Assert.assertTrue(driver.findElement(By.xpath("//div[2]/div[2]/div[2]/s")).getCssValue("strike"), true);


//g
      Assert.assertTrue(driver.findElement(By.xpath("//div[2]/div[2]/strong")).getCssValue("color"),true);

//d
        driver.findElement(By.xpath("//div[2]/div[2]/div[2]/s"));
        driver.findElement(By.xpath("//div[2]/div[2]/div[2]/s"));
        Assert.assertNotEquals(driver.findElement(By.xpath("//div[2]/div[2]/div[2]/s")).getSize(), driver.findElement(By.xpath("//div[2]/div[2]/div[2]/s")).getSize());




    }
}
