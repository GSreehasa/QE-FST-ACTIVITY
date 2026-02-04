package demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test_Activity3 {
    WebDriver driver;
    WebDriverWait wait;
    @BeforeClass
    public void setup(){
        driver=new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.get("https://training-support.net/webelements/login-form/");}
        @Test
        public void testt(){

        driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.id("password")).sendKeys("password");

driver.findElement(By.xpath("//button[contains(text(), 'Submit')]")).click();

String message = wait.until(ExpectedConditions.visibilityOfElementLocated(
By.xpath("//*[contains(text(), 'Welcome')]")
)).getText();

System.out.println("Login message: " + message);

Assert.assertTrue(message.contains("Welcome"), "The login message did not contain 'Welcome'!");
}

@AfterClass
public void tearDown() {
if (driver != null) {
driver.quit();
}
}
}

