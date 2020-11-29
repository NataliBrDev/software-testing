import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class AddPosition {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/home/natali/geckodriver/geckodriver");
        DesiredCapabilities dc = DesiredCapabilities.firefox();
        dc.setCapability("marionette", true);
        WebDriver driver = new FirefoxDriver(dc);
        //ChromeDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://localhost/litecart/admin/");
        driver.findElement(By.xpath("//*[@id=\"box-login\"]//tr[1]/td[1]"));
        WebElement element = driver.findElement(By.xpath("//*[@id=\"box-login\"]//span/input"));
        element.sendKeys("admin");
        WebElement pass = driver.findElement(By.xpath("//form//tr[2]/td[2]/span/input"));
        pass.sendKeys("admin");
        WebElement button;
        button = driver.findElement(By.xpath("//div/form/div[2]/button"));
        button.click();
        driver.findElement(By.xpath("//div[3]/ul/li[3]/a/span[2]")).click();

        driver.findElement(By.xpath("//div/table//tr/td[1]/div[3]/ul/li[2]/a/span[2]")).click();
        driver.findElement(By.xpath("//div/table//tr/td[3]/div[1]/a[2]")).click();

        driver.findElement(By.xpath("/html/body//div//table//tr/td[3]/form///table//tr[1]/td/label[1]/input")).click();
        driver.findElement(By.xpath("//div/table//tr/td[3]//table//tr[2]/td/span/input")).sendKeys("test");
        driver.findElement(By.xpath("//div/table//tr/td[3]//div/table//tr[3]/td/input")).sendKeys("19274");
        driver.findElement(By.xpath("//div/table//tr/td[3]//table//tr[8]/td/table//tr/td[1]/input//div/table//tr/td[3]//table//tr[8]/td/table//tr/td[1]/input")).sendKeys("34");
        driver.findElement(By.xpath("//div/table//tr/td[3]//table//tr[8]/td/table//tr/td[2]/select")).click();
        driver.findElement(By.xpath("//div/table//tr/td[3]//table//tr[8]/td/table//tr/td[3]/select")).click();
        driver.findElement(By.xpath("//div/table//tr/td[3]//table//tr[9]/td/table//tr[1]/td/input")).click(); ///file

        driver.findElement(By.xpath("//div/table//tr/td[3]/form//table//tr[10]/td/input")).sendKeys("13122020");
        driver.findElement(By.xpath("//div/table//tr[11]/td/input")).sendKeys("13012021");
        driver.findElement(By.xpath("//div/table//tr/td[3]/form/p/span/button[1]")).click();



    }
}
