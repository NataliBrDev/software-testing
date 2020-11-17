import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class WebTEst extends  Start{
   private WebDriver driver;
   private WebDriverWait wait;

   @Before
    public void start(){
       // driver = new ChromeDriver();
       WebDriver driver = new FirefoxDriver();
       wait = new WebDriverWait(driver, 10);
      driver.manage().addCookie(new Cookie("test", "test"));
      Cookie testCookie = driver.manage().getCookieNamed("test");
      Set<Cookie> cookies = driver.manage().getCookies();
      driver.manage().deleteCookieNamed("test");
      driver.manage().deleteAllCookies();
   }
   @Test
   public void firsttest(){
      driver.navigate().to("http://localhost/litecart/admin");
      driver.findElement(By.xpath("//*[@id=\"box-login\"]/form/div[1]/table/tbody/tr[1]/td[1]"));
      WebElement element = driver.findElement(By.xpath("//*[@id=\"box-login\"]/form/div[1]/table/tbody/tr[1]/td[2]/span/input"));
      element.sendKeys("admin");
      WebElement pass = driver.findElement(By.xpath("//*[@id='box-login'']/form/div[1]/table/tbody/tr[2]/td[2]/span/input"));
       pass.sendKeys("admin");
      WebElement button = driver.findElement(By.xpath("//*[@id=\"box-login\"]/form/div[2]/button"));
      button.click();

   driver.quit();
   }

}
