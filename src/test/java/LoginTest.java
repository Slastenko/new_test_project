import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTest extends BaseTest {

    @BeforeEach
    public void openUrl() {
        driver.get("https://kabinet.dreamkas.ru/app/#!/login/");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Войти']")));
    }

    @Test
    public void testLoginButton() {
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Войти']"));
        Assert.assertTrue(loginButton.isEnabled());
    }

    @Test
    public void testLogin() {
        driver.findElement(By.id("k-login-form__login")).sendKeys("v.slastenko@dreamkas.ru");
        driver.findElement(By.id("k-login-form__password")).sendKeys("Policina5");
        driver.findElement(By.xpath("//button[text()='Войти']")).click();

//        String message = driver.findElement(By.xpath("//div[@class='message-text']")).getText();
//        assert message.equals("Login successful");

        driver.quit();
    }

}
