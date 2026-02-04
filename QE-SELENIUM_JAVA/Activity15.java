package demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity15 {
    public static void main(String[] args) {
        

        WebDriver driver=new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://training-support.net/webelements/dynamic-attributes");
        System.out.println("Page Title:"+driver.getTitle());
        WebElement fullname = driver.findElement(
        By.xpath("//input[starts-with(@id,'full-name')]"));
        WebElement email = driver.findElement(
        By.cssSelector(("input[id$='email']")));
         WebElement event = driver.findElement(
        By.xpath("//input[contains(@name,'event-date')]"));
         WebElement additional_details = driver.findElement(
        By.xpath("//textarea[contains(@id,'additional-details')]"));
        

        fullname.sendKeys("sree");
        email.sendKeys("sree@gmail.com");
        event.sendKeys("2026-02-15");
        additional_details.sendKeys("excited");

        driver.findElement(By.xpath("//button[text()='Submit']")).click();

            
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation")));
        String msg=driver.findElement(By.id("action-confirmation")).getText();

            
        System.out.println("Success Message: " + msg);

      
            
            driver.quit();
    }
}
