package demos;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity12 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/dynamic-content");
        System.out.println("Page Title: " + driver.getTitle());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        Actions actions = new Actions(driver);

        By clickMeBtn = By.xpath("//button[contains(normalize-space(.),'Click')]");
        WebElement btn = wait.until(ExpectedConditions.visibilityOfElementLocated(clickMeBtn));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btn);
        actions.moveToElement(btn).click().perform();
       By wordText = By.id("word");
       wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("word"), "release"));

       WebElement msg = driver.findElement(wordText);

        System.out.println("Release text found: " + msg.getText());

        driver.quit();
    }
}