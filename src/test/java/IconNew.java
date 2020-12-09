import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class IconNew {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "/home/natali/geckodriver/geckodriver");
        DesiredCapabilities dc = DesiredCapabilities.firefox();
        dc.setCapability("marionette", true);
        WebDriver driver = new FirefoxDriver(dc);
        //ChromeDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://litecart.stqa.ru/en/");
       // driver.manage().window().maximize();

        for ( int i=1; i<=10; i++) {

            driver.findElement(By.xpath("//div[3]/div/ul/li[" + i + "]/a[1]"));
            var elSticker= driver.findElement(By.xpath("//div[3]/div/ul/li["+i+"]/a[1]/div[1]/div"));
            ArrayList liststickers = new ArrayList();
            liststickers.add(elSticker);
            liststickers.stream().count();

                elSticker.getCssValue("ul.listing-wrapper");
                elSticker.isDisplayed();
                long c = liststickers.stream().count();
                int l = (int) c;
                System.out.println(l);
                //  Assert.assertArrayEquals(1,l);


        }
    }
}
