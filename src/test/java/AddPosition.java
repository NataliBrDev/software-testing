import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AddPosition<i> {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.gecko.driver", "/home/natali/geckodriver/geckodriver");
        DesiredCapabilities dc = DesiredCapabilities.firefox();
        dc.setCapability("marionette", true);
        WebDriver driver = new FirefoxDriver(dc);
        //ChromeDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://localhost/litecart/admin/");
//login
        WebElement element = driver.findElement(By.xpath("//*[@id=\'box-login\']//span/input"));
        element.sendKeys("admin");
        WebElement pass = driver.findElement(By.xpath("//form//tr[2]/td[2]/span/input"));
        pass.sendKeys("admin");
        WebElement button;
        button = driver.findElement(By.xpath("//div/form/div[2]/button"));
        button.click();

        driver.findElement(By.xpath("//div//tr/td[1]//ul/li[2]/a/span[2]")).click();


        List<WebElement> rows = driver.findElements(By.xpath("//div/table//tr/td[3]/form/table/tbody//tr"));

            //tab General

            driver.findElement(By.xpath("//div/table//tr/td[3]/div[1]/a[2]")).click();
            driver.findElement(By.xpath("//div//table//tr[1]/td/label[1]/input")).click();
            driver.findElement(By.xpath("//div/table//tr/td[3]//table//tr[2]/td/span/input")).sendKeys("test");

            driver.findElement(By.xpath("//div/table//tr/td[3]//div/table//tr[3]/td/input")).sendKeys("19274");
            driver.findElement(By.xpath("//div/table//tr/td[3]//table//tr[8]/td/table//tr/td[1]/input")).sendKeys("34");
            driver.findElement(By.xpath("//div/table//tr/td[3]//table//tr[8]/td/table//tr/td[2]/select")).click();
            driver.findElement(By.xpath("//div/table//tr/td[3]//table//tr[8]/td/table//tr/td[3]/select")).click();
            var elem = driver.findElement(By.xpath("//table//tr[9]/td/table//tr[1]/td/input"));  //file

            File file = new File("resources/1.jpg");
            elem.sendKeys(file.getAbsolutePath());
            //driver.findElement(By.id("fake_pic")).sendKeys(file.getAbsolutePath());


            driver.findElement(By.xpath("//div/table//tr/td[3]//table//tr[10]/td/input")).sendKeys("13122020");
            driver.findElement(By.xpath("//div/table//tr[11]/td/input")).sendKeys("13012021");


            //Information
            driver.findElement(By.xpath("//div/table//tr/td[3]//ul/li[2]/a")).click();
            //  driver.findElement(By.xpath("//div//tr/td[3]//table//tr[1]/td/select")).click();
            //driver.findElement(By.xpath("//div//tr/td[3]//table//tr[2]/td/select")).click();
            //  driver.findElement(By.xpath("//table//tr/td[3]//table//tr[3]/td/input")).sendKeys("testabc");
            driver.findElement(By.xpath("//table//tr[4]/td/span/input")).sendKeys("zxcvbnm,efdfdgvfdgv");
            driver.findElement(By.xpath("//table//tr[5]/td/span/div/div[2]")).sendKeys("eufguedcfbdjcdbvocbeo;vabva;oibveoibvdejbv");
            driver.findElement(By.xpath("//table//tr[6]/td/span/input")).sendKeys("qwerty");
            driver.findElement(By.xpath("//table//tr[7]/td/span/input")).sendKeys("asdfgh");


            //Price
            driver.findElement(By.xpath("//div/table//tr/td[3]//ul/li[4]/a")).click();
            driver.findElement(By.xpath("//tr/td[3]//div[4]/table[1]//tr/td/input")).sendKeys("23");
            //  driver.findElement(By.xpath("//tr/td[3]//table[1]//tr/td/select")).click();
            //driver.findElement(By.xpath("//table//tr/td[3]//div[4]/table[1]//select/option[2]")).click();
            driver.findElement(By.xpath("//tr/td[3]//div[4]/table[2]//tr[1]/td/select")).click();
            driver.findElement(By.xpath("//div[4]/table[3]//tr[2]/td[1]/span/input")).sendKeys("345");
            // driver.findElement(By.xpath("//div[4]/table[3]//tr[2]/td[2]/input")).sendKeys("5");
            driver.findElement(By.xpath("//div[4]/table[3]//tr[3]/td[1]/span/input")).sendKeys("87");

            driver.findElement(By.xpath("//div/table//tr/td[3]/form/p/span/button[1]")).click();


            driver.findElement(By.xpath("//div//tr/td[1]//ul/li[2]/a/span[2]")).click();
            List<WebElement> rows1 = driver.findElements(By.xpath("//div/table//tr/td[3]/form/table/tbody//tr"));




            Assert.assertNotEquals(rows.size(), rows1.size());

    }
}