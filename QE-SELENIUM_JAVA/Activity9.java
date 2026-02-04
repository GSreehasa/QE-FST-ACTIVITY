package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Activity9 {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       
        Actions builder = new Actions(driver);

        try {
            
            driver.get("https://training-support.net/webelements/keyboard-events");

            
            System.out.println("Title: " + driver.getTitle());

           
            builder.sendKeys("Hello Selenium!").sendKeys(Keys.RETURN).build().perform();

            
            WebElement result = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div > main > div > div > div > div > div.mx-auto.my-5.flex.w-full.flex-col.justify-around > h1")));

           
            System.out.println("Message displayed: " + result.getText());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}