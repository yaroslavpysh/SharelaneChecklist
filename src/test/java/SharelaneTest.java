import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SharelaneTest {

    @Test
    public void zipCode4Digits(){
        //1. Открыть браузер
        //2. Зайти на сайт
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        WebDriver browser = new ChromeDriver();
            browser.get("https://www.sharelane.com/cgi-bin/register.py");
            browser.findElement(By.name("zip_code")).sendKeys("1234");
            browser.quit();

    }
}
