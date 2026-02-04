package demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity8 {
    public static void main(String[] args) {
        FirefoxDriver driver=new FirefoxDriver();
        driver.manage().window().fullscreen();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        Actions builder=new Actions(driver);
        driver.get("https://training-support.net/webelements/mouse-events");
        System.out.println("Page title is: " + driver.getTitle());
        WebElement cargolock=driver.findElement(By.cssSelector(".file:nth-child(1)"));
        WebElement cargoToml=driver.findElement(By.cssSelector(".file:nth-child(2)"));
        WebElement src=driver.findElement(By.cssSelector(".file:nth-child(3)"));
        WebElement target=driver.findElement(By.cssSelector(".file:nth-child(4)"));
        builder.click(cargolock).moveToElement(cargoToml)
.click()
.build()
.perform();
System.out.println("Result is "+driver.findElement(By.id("result")).getText());
builder.doubleClick(src).contextClick(target).build().perform();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.w-full:nth-child(1)")));
WebElement openButton = driver.findElement(By.cssSelector("li.w-full:nth-child(1)"));


builder.click(openButton).build().perform();
System.out.println("Result is: " + driver.findElement(By.id("result")).getText());


        


    }
}
