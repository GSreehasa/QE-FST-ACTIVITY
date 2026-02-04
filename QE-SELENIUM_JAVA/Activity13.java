package demos;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;

public class Activity13 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/tables");
        System.out.println("Page tittle is"+driver.getTitle());
        List<WebElement>rows=driver.findElements(By.xpath("//table/tbody/tr"));
        System.out.println("Number of rows: " + rows.size());
        List<WebElement>cols=driver.findElements(By.xpath("//table/thead/tr/th"));
        System.out.println("Number of columns: " + cols.size());
        List<WebElement>third=driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
         for (WebElement cell : third) {
            System.out.println(cell.getText());}
        WebElement second=driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
         System.out.println(second.getText());
         driver.quit();

    }
}
