
import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class Start {

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
        int i = 0;
        do {
            i++;
            driver.findElement(By.xpath("//div[3]/ul/li[" + i + "]/a/span[2]")).click();
            assertEquals(String.valueOf(By.xpath("//table//tr/td[3]/h1")), true, true);
        }
        while (i >0 && i<=17 ) ;

    }}


