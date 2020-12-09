import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;
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
        //driver.manage().window().maximize();

//a
        var elementNameText = driver.findElement(By.xpath("//div[2]/div[4]//ul/li/a[1]/div[2]")).getText();  //name
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div[4]/div/ul/li/a[1]")).click();
        var elementName1Text = driver.findElement(By.xpath("//div[2]/div[2]/div[1]/h1")).getText();  //name1
        Assert.assertEquals( elementNameText, elementName1Text);

        driver.findElement(By.xpath("//div//div[2]/div/div[1]/nav/ul/li[1]/a")).click();
        //b
        var elPrice= driver.findElement(By.xpath("//div[4]/div/ul/li/a[1]/div[4]/s")).getText();
        System.out.println(elPrice);
        var elPriceRed= driver.findElement(By.xpath("//div[4]/div/ul/li/a[1]/div[4]/strong")).getText();
        driver.findElement(By.xpath("//div[2]/div[4]/div/ul/li/a[1]")).click();;
        var elPrice1 =driver.findElement(By.xpath("//div[2]//div[2]/div[2]/s")).getText();
        var elPriceRed1= driver.findElement(By.xpath("//div[2]/div[2]/strong")).getText();
       Assert.assertEquals(elPrice, elPrice1);
       Assert.assertEquals(elPriceRed,elPriceRed1);


//v
      Assert.assertEquals(driver.findElement(By.xpath("//div[2]/div[2]/div[2]/s")).getCssValue("text-decoration-line"),"line-through");
      Assert.assertEquals(driver.findElement(By.xpath("//div[2]/div[2]/div[2]/s")).getCssValue("color"),"rgb(102, 102, 102)");


//g
        Assert.assertEquals(driver.findElement(By.xpath("//div[2]/div[2]/strong")).getCssValue("color"),"rgb(204, 0, 0)");
      //  driver.findElement(By.xpath("//div[2]/div[2]/strong")).getColor();
        Assert.assertEquals(driver.findElement(By.xpath("//div[2]/div[2]/strong")).getCssValue("color"),"rgb(204, 0, 0)");


//d
       Assert.assertEquals( driver.findElement(By.xpath("//div[2]/div[2]/strong")).getCssValue("color"),"rgb(204, 0, 0)");
       Assert.assertEquals(driver.findElement(By.xpath("//div[2]/div[2]/strong")).getCssValue("font-size"),"22px");


    }
}
