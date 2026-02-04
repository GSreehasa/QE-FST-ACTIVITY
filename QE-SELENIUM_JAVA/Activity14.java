package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;

public class Activity14 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/tables");
        System.out.println("page Title:"+driver.getTitle());
        List<WebElement>rows=driver.findElements(By.xpath("//table/tbody/tr"));
         System.out.println("Number of rows: " + rows.size());
        List<WebElement> cols=driver.findElements(By.xpath("//table/thead/tr/th"));
         System.out.println("Number of columns: " + cols.size());
        WebElement fifthvalue=driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]"));
         System.out.println("Book name: "+ fifthvalue .getText());
        WebElement price =driver.findElement(By.xpath("//table/thead/tr/th[5]"));
        price.click();
        System.out.println("Price Heading clicked for sorting");
        WebElement fifth_after_sort=driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]"));
        System.out.println("5th Book name after sorting"+fifth_after_sort.getText());
        driver.quit();
        

    }
}
