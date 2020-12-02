import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

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


for (int i = 1; i <= 2; i++) {
    driver.findElement(By.xpath("//div[3]/div/ul/li["+i+"]/a[1]")).click();
    driver.findElement(By.xpath("//div[5]//table//tr/td/button")).click();
    driver.findElement(By.xpath("//div[2]/div[2]/div[1]/nav/ul/li[1]/a")).click();
  driver.wait();


   }
   driver.findElement(By.xpath("//div[2]/div[3]/div/ul/li[3]/a[1]")).click();
        driver.findElement(By.xpath("//div[5]//table//tr/td/button")).click();

        driver.findElement(By.xpath("//div[1]/div/header/div[3]/div/a[3]")).click();

    }
}
