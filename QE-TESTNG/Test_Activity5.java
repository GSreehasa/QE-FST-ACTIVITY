package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test_Activity5 {

    WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/target-practice");
    }

    // 🔹 Page title test
    @Test
    public void checkPageTitle() {
        String title = driver.getTitle();
        Assert.assertTrue( title.contains("Target Practice"));

    }

   
    @Test(groups = "HeaderTests")
    public void verifyThirdHeaderText() {
        WebElement h3 = driver.findElement(By.tagName("h3"));
        Assert.assertEquals(h3.getText(), "Heading #3");
    }

    @Test(groups = "HeaderTests")
    public void verifyFifthHeaderColor() {
        WebElement h5 = driver.findElement(By.tagName("h5"));
        String color = h5.getCssValue("color");
        String hexColor = Color.fromString(color).asHex();
        Assert.assertEquals(hexColor, "#9333ea");
    }

    
    @Test(groups = "ButtonTests")
    public void verifyEmeraldButtonText() {
        WebElement emeraldButton = driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/button[8]"));
        Assert.assertEquals(emeraldButton.getText(), "Emerald");
    }

    @Test(groups = "ButtonTests")
    public void verifyThirdRowFirstButtonColor() {
        WebElement button =
                driver.findElement(By.xpath("(/html/body/div/main/div/div/div/div/div[2]/button[5])"));

        String color = button.getCssValue("background-color");
        String hexColor = Color.fromString(color).asHex();
        Assert.assertEquals(hexColor, "#e9d5ff");
    }

    @AfterClass
    public void tearDown() {
        driver.close();
    }
}