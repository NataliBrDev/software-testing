import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AddPositionOnBox {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "/home/natali/geckodriver/geckodriver");
        DesiredCapabilities dc = DesiredCapabilities.firefox();
        dc.setCapability("marionette", true);
        WebDriver driver = new FirefoxDriver(dc);
        //ChromeDriver driver =new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[2]//div[2]//aside/div[2]/div[3]//tr[1]/td/input")).sendKeys("Nati");
        driver.findElement(By.xpath("//div[2]/div/div[2]/div[1]/aside//div[3]//tr[2]/td/input")).sendKeys("natalk.dev@gmail.com");
        driver.findElement(By.xpath("//div[2]//div[2]/div[1]/aside/div[2]/div[3]//tr[4]/td/span/button[1]")).click();


        driver.findElement(By.xpath("//div[2]//div[1]/nav/ul/li[2]/a")).click();

        driver.findElement(By.xpath("//div[2]//div[2]/div[2]//ul[2]/li[1]")).click();
        driver.findElement(By.xpath("//div[2]/div[2]//tr/td/button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

               driver.findElement(By.xpath("//div[2]//div[3]/div/ul/li[1]/a[1]")).click();
               driver.findElement(By.xpath("//div[2]//div[2]//div[2]//tr/td/button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//div[2]//div[3]/div/ul/li[3]/a[1]")).click();
        driver.findElement(By.xpath("//div[2]//div[2]//div[2]//tr/td/button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//div[2]//div[1]/nav/ul/li[2]/a")).click();

        driver.findElement(By.xpath("//div[1]//div[3]/div/a[3]")).click();


    }
}
