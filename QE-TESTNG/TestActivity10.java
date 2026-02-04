package demos;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestActivity10 {

    
    @DataProvider(name = "excelData")
    public Object[][] readExcelData() throws Exception {

        FileInputStream fis = new FileInputStream("src/test/java/demos/Activity10_inp.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);

        int rowCount = sheet.getPhysicalNumberOfRows();
        int colCount = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[rowCount - 1][colCount];

        for (int i = 1; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                data[i - 1][j] = sheet.getRow(i).getCell(j).toString();
            }
        }

        workbook.close();
        fis.close();
        return data;
    }

    
    @Test(dataProvider = "excelData")
    public void fillSimpleForm(String name, String email, String date, String details)
            throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://training-support.net/webelements/simple-form");

        driver.findElement(By.id("name")).sendKeys(name);
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("date")).sendKeys(date);
        driver.findElement(By.id("details")).sendKeys(details);

        driver.findElement(By.cssSelector("button[type='submit']")).click();

        Alert alert = driver.switchTo().alert();
        System.out.println("Alert Message: " + alert.getText());
        alert.accept();

        driver.quit();
    }
}