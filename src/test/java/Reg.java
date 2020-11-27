import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Reg {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/home/natali/geckodriver/geckodriver");
        DesiredCapabilities dc = DesiredCapabilities.firefox();
        dc.setCapability("marionette", true);
        WebDriver driver = new FirefoxDriver(dc);
        //ChromeDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://localhost/litecart/en/");

        //registation
        driver.findElement(By.xpath("//div/form/table//tr[5]/td/a")).click();
        driver.findElement(By.xpath("//div[2]//div[2]//h1")).getText();
        driver.findElement(By.xpath("//div//table//tr[1]/td[1]/input")).getAttribute("name");
        driver.findElement(By.xpath("//div//table//tr[2]/td[1]/input")).sendKeys("Natali");
        driver.findElement(By.xpath("//div//table//tr[2]/td[2]/input")).sendKeys("Braznik");
        driver.findElement(By.xpath("//div//table//tr[3]/td[1]/input")).sendKeys("Ukraine, Hres45/98");
        driver.findElement(By.xpath("//div//table//tr[4]/td[1]/input")).sendKeys("04107");
        driver.findElement(By.xpath("//div//table//tr[4]/td[2]/input")).sendKeys("Kyiv");
        driver.findElement(By.xpath("//div//table//tr[5]/td[1]/span[2]/span[1]/span")).click();
       driver.findElement(By.xpath("//body//span[2]/ul/li[222]")).click();
                driver.findElement(By.xpath("//div//table//tr[6]/td[1]/input")).sendKeys("natali.butko.dev@gmail.com");
        driver.findElement(By.xpath("//div//table//tr[6]/td[2]/input")).sendKeys("+3806697929492");
        driver.findElement(By.xpath("//div/form/table//tr[5]/td[2]/select")).isSelected();
          driver.findElement(By.xpath("//div/form/table//tr[5]/td[2]/select")).click();
               driver.findElement(By.xpath("//div//table//tr[7]/td[1]/label/input")).isSelected();
        driver.findElement(By.xpath("//div//table//tr[7]/td[1]/label/input")).click();
       driver.findElement(By.xpath("//div//table//tr[8]/td[1]/input")).sendKeys("Zxcvbn123!");
        driver.findElement(By.xpath("//div//table//tr[8]/td[2]/input")).sendKeys("Zxcvbn123!");
        driver.findElement(By.xpath("//div//table//tr[9]/td/button")).click();

        //logout
        driver.findElement(By.xpath("//div//aside//div/ul/li[4]/a")).click();
        //login
        driver.findElement(By.xpath("//div//aside//table/tbody/tr[1]/td/input")).sendKeys("");
        driver.findElement(By.xpath("//div/aside/div//table//tr[2]/td/input")).sendKeys("");
        driver.findElement(By.xpath("//div/form/table//tr[4]/td/span/button[1]")).click();

        //relogout
        driver.findElement(By.xpath("//div/aside//div/ul/li[4]/a")).click();
    }
}
