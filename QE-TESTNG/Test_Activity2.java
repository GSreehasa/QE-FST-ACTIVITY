package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test_Activity2 {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/target-practice/");}
    @Test
    public void test1(){
        driver.getTitle();
        Assert.assertTrue( driver.getTitle().contains("Target Practice"));


    }
    @Test
    public void test2(){
        WebElement button=driver.findElement(By.cssSelector("body > div > main > div > div > div > div > div.my-16.grid.max-h-80.gap-4.px-5.md\\:grid-cols-4.xl\\:grid-cols-4.xl\\:px-80 > button.rounded-xl.bg-slate-200.p-2.text-3xl.font-bold.text-slate-900.svelte-2hb4ib"));
        Assert.assertFalse(button.isDisplayed());
;
        

    }
    @Test(enabled=false)
    public void test3(){
        System.out.println("This test will not execute");

    }
    @Test
    public void test4(){
        throw new SkipException("This method is skipped using skipexception");

    }

    @AfterClass
    public void teardown(){
        driver.close();
    }
    }


