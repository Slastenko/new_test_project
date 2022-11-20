//import org.openqa.selenium.By
//import org.openqa.selenium.WebDriver
//
//class LoginStressTest {
//    fun runTest(numUsers: Int) {
//        for (i in 1..numUsers) {
//            val username = "user$i"
//            val password = "password$i"
//            val driver = setupDriver()
//            driver.get("https://kabinet.dreamkas.ru/app/#!/login/")
//            val usernameField = driver.findElement(By.id("username"))
//            usernameField.sendKeys(username)
//            val passwordField = driver.findElement(By.id("password"))
//            passwordField.sendKeys(password)
//            val loginButton = driver.findElement(By.id("login-button"))
//            loginButton.click()
//            validateLogin(driver, username)
//            driver.quit()
//        }
//    }
//
//    private fun setupDriver(): WebDriver {
//        // Set up the driver and return it
//    }
//
//    private fun validateLogin(driver: WebDriver, username: String) {
//        // Validate that the user has logged in successfully
//    }
//}
