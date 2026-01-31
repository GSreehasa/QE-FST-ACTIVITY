package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/target-practice");
        System.out.println(driver.getTitle());
        System.out.println(driver.findElement(By.xpath("//h3[text()='Heading #3']")).getText());
        System.out.println(driver.findElement(By.xpath("//h5[text()='Heading #5']")).getCssValue("color"));
         System.out.println(driver.findElement(By.xpath("//button[text()='Purple']")).getAttribute("class"));
        System.out.println(driver.findElement(By.className("bg-slate-200")).getText());
        driver.quit();
    }
}