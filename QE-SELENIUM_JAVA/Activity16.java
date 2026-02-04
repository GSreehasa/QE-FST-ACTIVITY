package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
import java.util.List;

public class Activity16 {
    public static void main(String[] args) {
        
        WebDriver driver = new FirefoxDriver();

        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            
            driver.get("https://training-support.net/webelements/selects");

            
            System.out.println("Page title: " + driver.getTitle());

           
            WebElement dropdownElement = driver.findElement(By.cssSelector("select"));
            Select dropdown = new Select(dropdownElement);

           
            dropdown.selectByIndex(1);
            System.out.println("Selected the second option.");

            
            dropdown.selectByIndex(2);
            System.out.println("Selected the third option.");

            
            dropdown.selectByIndex(3);
            System.out.println("Selected the fourth option.");

            
            System.out.println("\n--- Available Options ---");
            List<WebElement> allOptions = dropdown.getOptions();
            for (WebElement option : allOptions) {
                System.out.println("Option: " + option.getText());
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            
            driver.quit();
        }
    }
}
