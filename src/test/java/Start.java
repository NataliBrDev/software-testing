
import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class Start {

    public static void main(String[] args)  {

        System.setProperty("webdriver.gecko.driver", "/home/natali/geckodriver/geckodriver");
        DesiredCapabilities dc = DesiredCapabilities.firefox();
        dc.setCapability("marionette", true);
       WebDriver driver =  new FirefoxDriver(dc);
        //ChromeDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://localhost/litecart/admin/login.php");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"box-login\"]//tr[1]/td[1]"));
        WebElement element = driver.findElement(By.xpath("//*[@id=\"box-login\"]//span/input"));
        element.sendKeys("admin");
        WebElement pass = driver.findElement(By.xpath("//form//tr[2]/td[2]/span/input"));
        pass.sendKeys("admin");
        WebElement button;
        button = driver.findElement(By.xpath("//div/form/div[2]/button"));
        button.click();
        WebElement icon1 = driver.findElement(By.xpath("//div[3]/ul/li[1]/a/span[2]"));
        icon1.click();
        WebElement icon2 = driver.findElement(By.xpath("//div[3]/ul/li[2]/a/span[2]"));
        icon2.click();
        WebElement icon3 = driver.findElement(By.xpath("//div[3]/ul/li[3]/a/span[2]"));
        icon3.click();
        WebElement icon4 = driver.findElement(By.xpath("//div[3]/ul/li[4]/a/span[2]"));
        icon4.click();
        WebElement icon5 = driver.findElement(By.xpath("//div[3]/ul/li[5]/a/span[2]"));
        icon5.click();
        WebElement icon6 = driver.findElement(By.xpath("//div[3]/ul/li[6]/a/span[2]"));
        icon6.click();
        WebElement icon7 = driver.findElement(By.xpath("//div[3]/ul/li[7]/a/span[2]"));
        icon7.click();
        WebElement icon8 = driver.findElement(By.xpath("//div[3]/ul/li[8]/a/span[2]"));
        icon8.click();
        WebElement icon9 = driver.findElement(By.xpath("//div[3]/ul/li[9]/a/span[2]"));
        icon9.click();
        WebElement icon10 = driver.findElement(By.xpath("//div[3]/ul/li[10]/a/span[2]"));
        icon10.click();
        WebElement icon11 = driver.findElement(By.xpath("//div[3]/ul/li[11]/a/span[2]"));
        icon11.click();
        WebElement icon12 = driver.findElement(By.xpath("//div[3]/ul/li[12]/a/span[2]"));
        icon12.click();
        WebElement icon13 = driver.findElement(By.xpath("//div[3]/ul/li[13]/a/span[2]"));
        icon13.click();
        WebElement icon14 = driver.findElement(By.xpath("//div[3]/ul/li[14]/a/span[2]"));
        icon14.click();
        WebElement icon15 = driver.findElement(By.xpath("//div[3]/ul/li[15]/a/span[2]"));
        icon15.click();
        WebElement icon16 = driver.findElement(By.xpath("//div[3]/ul/li[16]/a/span[2]"));
        icon16.click();
        WebElement icon17 = driver.findElement(By.xpath("//div[3]/ul/li[17]/a/span[2]"));
        icon17.click();
        WebElement icon18 = driver.findElement(By.xpath("//div[3]/ul/li[18]/a/span[2]"));
        icon18.click();
        WebElement icon19 = driver.findElement(By.xpath("//div[3]/ul/li[19]/a/span[2]"));
        icon19.click();



      icon1.click();
        Assert.assertTrue(String.valueOf(By.xpath("//table//tr/td[3]/h1")), true);
     icon2.click();
     Assert.assertTrue(String.valueOf(By.xpath("//table//tr/td[3]/h1")), true);
     icon3.click();
     Assert.assertTrue(String.valueOf(By.xpath("//table//tr/td[3]/h1")), true);
     icon4.click();
     Assert.assertTrue(String.valueOf(By.xpath("//table//tr/td[3]/h1")), true);
     icon5.click();
     Assert.assertTrue(String.valueOf(By.xpath("//table//tr/td[3]/h1")), true);
     icon6.click();
     Assert.assertTrue(String.valueOf(By.xpath("//table//tr/td[3]/h1")), true);
     icon7.click();
     Assert.assertTrue(String.valueOf(By.xpath("//table//tr/td[3]/h1")), true);
     icon8.click();
     Assert.assertTrue(String.valueOf(By.xpath("//table//tr/td[3]/h1")), true);
     icon9.click();
     Assert.assertTrue(String.valueOf(By.xpath("//table//tr/td[3]/h1")), true);
     icon10.click();
     Assert.assertTrue(String.valueOf(By.xpath("//table//tr/td[3]/h1")), true);
     icon11.click();
     Assert.assertTrue(String.valueOf(By.xpath("//table//tr/td[3]/h1")), true);
     icon12.click();
     Assert.assertTrue(String.valueOf(By.xpath("//table//tr/td[3]/h1")), true);
     icon13.click();
     Assert.assertTrue(String.valueOf(By.xpath("//table//tr/td[3]/h1")), true);

     driver.quit();
     driver.close();
    }
}


