import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AddPositionOnBox {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "/home/natali/geckodriver/geckodriver");
        DesiredCapabilities dc = DesiredCapabilities.firefox();
        dc.setCapability("marionette", true);
        WebDriver driver = new FirefoxDriver(dc);
        //ChromeDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://litecart.stqa.ru/en/");
        driver.manage().window().maximize();


        driver.findElement(By.xpath("//div[2]/div[3]/div/ul/li[1]/a[1]")).click();
        driver.findElement(By.xpath("//div[2]/div[5]//table//tr/td/button")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10/*seconds*/);
      //  WebElement dynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("dynamicElement_id")));

        driver.findElement(By.xpath("//div[2]/div[3]/div/ul/li[2]/a[1]")).click();
        driver.findElement(By.xpath("//div[5]//table//tr/td/button")).click();
        WebDriverWait wait1 = new WebDriverWait(driver, 10/*seconds*/);

        driver.findElement(By.xpath("//div[2]/div[3]/div/ul/li[4]/a[1]")).click();
        driver.findElement(By.xpath("//div[2]/div[5]//table//tr/td/button")).click();
        WebDriverWait wait2 = new WebDriverWait(driver, 10/*seconds*/);

        driver.findElement(By.xpath("//div/header/div[3]/div/a[3]")).click();


    }
}
