import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    @Test
    public void openLink() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Forgot Password")).click();
        WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
        email.sendKeys("lukaemrashvili93@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"form_submit\"]/i")).click();
    }
}
