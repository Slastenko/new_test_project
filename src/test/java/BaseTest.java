import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest {
    WebDriverManager.chromedriver().setup;
    WebDriver driver = new ChromeDriver();

}
