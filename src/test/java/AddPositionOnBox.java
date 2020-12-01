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


for (int i = 1; i == 3; i++) {
    driver.findElement(By.xpath("//div[3]/div/ul/li["+i+"]/a[1]")).click();
    driver.findElement(By.xpath("//div[5]//table//tr/td/button")).click();
    driver.wait(34,4);

   }

         driver.findElement(By.xpath("//div/header/div[3]/div/a[3]")).click();
        driver.findElement(By.xpath("//div/ul/li[1]//div/p[5]/button")).click();
           driver.findElement(By.xpath("//div/ul/li[1]//div/p[4]/button"));
           driver.findElement(By.xpath("//div/ul/li//div/p[4]/button"));

    }
}
