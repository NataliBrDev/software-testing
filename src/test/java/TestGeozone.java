
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.ArrayList;
import java.util.Collections;
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

        driver.findElement(By.xpath("//div//tr/td[3]//tr[1]/td[5]")).click();
       ArrayList<String> countriesList = new ArrayList<>();
        for (int i = 1; i < 239; i++) {
            String country = driver.findElement(By.xpath("//div//tr/td[3]//tr[" + i + "]/td[5]/a")).getText();
            System.out.println(country);
            countriesList.add(country);
            driver.findElement(By.xpath("//div//tr/td[3]//tr[" + i + "]/td[5]")).click();

            String num = driver.findElement(By.xpath("//div//tr/td[3]//tr[" + i + "]/td[6]")).getText();
            int internalN = Integer.parseInt(num);
            if (internalN > 0) {
                driver.findElement(By.xpath("//div//tr/td[3]//tr[" + i + "]/td[5]")).click();
            }
        }
        ArrayList<String> countriesListCopy = new ArrayList<>(countriesList);
        Collections.sort(countriesListCopy);
        assertTrue(countriesList.equals(countriesListCopy));
        countriesList.forEach((x) -> System.out.println(x));

driver.quit();
    }
}


