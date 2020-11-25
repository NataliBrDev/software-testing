import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class TestGeozone {
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


        WebElement icon3 = driver.findElement(By.xpath("//div[3]/ul/li[3]/a/span[2]"));
        icon3.click();

            String country1 = driver.findElement(By.xpath("//div/table//tr/td[3]//table//tr[2]/td[5]")).getAttribute("value");
            String country2 = driver.findElement(By.xpath("//div/table//tr/td[3]//table//tr[3]/td[5]")).getAttribute("value");
            String country3 = driver.findElement(By.xpath("//div/table//tr/td[3]//table//tr[4]/td[5]")).getAttribute("value");
            String country4 = driver.findElement(By.xpath("//div/table//tr/td[3]//table//tr[5]/td[5]")).getAttribute("value");
            String country5 = driver.findElement(By.xpath("//div/table//tr/td[3]//table//tr[6]/td[5]")).getAttribute("value");
            String country6 = driver.findElement(By.xpath("//div/table//tr/td[3]//table//tr[7]/td[5]")).getAttribute("value");
            String country7 = driver.findElement(By.xpath("//div/table//tr/td[3]//table//tr[8]/td[5]")).getAttribute("value");
            String country8 = driver.findElement(By.xpath("//div/table//tr/td[3]//table//tr[9]/td[5]")).getAttribute("value");
            String country9 = driver.findElement(By.xpath("//div/table//tr/td[3]//table//tr[10]/td[5]")).getAttribute("value");
            String country10 = driver.findElement(By.xpath("//div/table//tr/td[3]//table//tr[11]/td[5]")).getAttribute("value");
            String country11 = driver.findElement(By.xpath("//div/table//tr/td[3]//table//tr[12]/td[5]")).getAttribute("value");
            String country12 = driver.findElement(By.xpath("//div/table//tr/td[3]//table//tr[13]/td[5]")).getAttribute("value");
            String country13 = driver.findElement(By.xpath("//div/table//tr/td[3]//table//tr[14]/td[5]")).getAttribute("value");
            String country14 = driver.findElement(By.xpath("//div/table//tr/td[3]//table//tr[15]/td[5]")).getAttribute("value");
            String country15 = driver.findElement(By.xpath("//div/table//tr/td[3]//table//tr[16]/td[5]")).getAttribute("value");
            String country16 = driver.findElement(By.xpath("//div/table//tr/td[3]//table//tr[17]/td[5]")).getAttribute("value");
            String country17 = driver.findElement(By.xpath("//div/table//tr/td[3]//table//tr[18]/td[5]")).getAttribute("value");
            String country18 = driver.findElement(By.xpath("//div/table//tr/td[3]//table//tr[19]/td[5]")).getAttribute("value");
            String country19 = driver.findElement(By.xpath("//div/table//tr/td[3]//table//tr[20]/td[5]")).getAttribute("value");
            String country20 = driver.findElement(By.xpath("//div/table//tr/td[3]//table//tr[21]/td[5]")).getAttribute("value");
            String country21 = driver.findElement(By.xpath("//div/table//tr/td[3]//table//tr[22]/td[5]")).getAttribute("value");
            String country22 = driver.findElement(By.xpath("//div/table//tr/td[3]//table//tr[23]/td[5]")).getAttribute("value");
            String country23 = driver.findElement(By.xpath("//div/table//tr/td[3]//table//tr[24]/td[5]")).getAttribute("value");
        }


}
