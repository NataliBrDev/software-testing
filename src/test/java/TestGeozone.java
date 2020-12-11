
import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class TestGeozone {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "/home/natali/geckodriver/geckodriver");
        DesiredCapabilities dc = DesiredCapabilities.firefox();
        dc.setCapability("marionette", true);
        WebDriver driver = new FirefoxDriver(dc);
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
        driver.findElement(By.xpath("//div[3]/ul/li[3]/a/span[2]")).click();

         List<WebElement> countries = driver.findElements(By.xpath("//div/table/tbody//table//tr/td[5]//a"));
         for (var elem : countries) {
            System.out.println(elem.getText());
         }
         Assert.assertTrue(String.valueOf(countries.stream().sorted()), true);


         List<WebElement> zones = driver.findElements(By.xpath("//div/table/tbody//table//tr/td[6]"));
         for (int i = 0; i < zones.size(); i++) {
            System.out.println(zones.get(i).getText());
            var count = Integer.parseInt(zones.get(i).getText());
            if (count > 0) {
                countries.get(i).click();
            }
        }

             List<WebElement> zones1 =driver.findElements(By.xpath("//div//tr/td[3]/form/table[2]//tbody/tr[2]/td[3]"));
             for (var elem1 : zones1){
                 System.out.println(elem1.getText());
             }
             Assert.assertTrue(String.valueOf(zones1.stream().sorted()), true);




        driver.quit();


        }
    }


