import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class NewWindow {

    private static Instant wait;

    public static void main(String[] args) throws InterruptedException {

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

        driver.findElement(By.xpath("//div/table//tr/td[1]/div[3]/ul/li[3]/a/span[2]"));
        String originalWindow = driver.getWindowHandle();
        driver.findElement(By.xpath("//div//tr/td[3]//tr[2]/td[5]/a")).click();
        //WebElement  existingWindow = driver.get("https://www.informatica.com/products/data-quality/data-as-a-service/address-verification/address-formats.html");
    //    WebElement newWindow = wait.until(originalWindow(existingWindow));
    //    driver.switchTo().window(String.valueOf(newWindow));
        driver.close();


    }
}
