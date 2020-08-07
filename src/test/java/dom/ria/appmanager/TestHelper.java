package dom.ria.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class TestHelper {
    private WebDriver driver;

    public TestHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void apartmentSale() {
        driver.findElement(By.xpath("//div[@id='boxPanelHead']/div[1]/div/label")).click();
    }

    public void secondaryHousing() {
        driver.findElement(By.id("catType_1_2_1")).click();
    }

    public void checkedApartments() {
        driver.findElement(By.xpath("//div[@id='boxPanelHead']/div[3]/label")).click();
        //driver.findElement(By.xpath("//div[@id='boxPanelHead']/div[2]/div/label")).click();
    }

    public void region(String City) {
        driver.findElement(By.id("autocompleteSearch")).sendKeys(City);
        driver.findElement(By.id("leftFilterForm")).submit();
        driver.findElement(By.xpath("//div[@id='remote']/label/span/div/div/div")).click();
        //driver.findElement(By.id("autocompleteSearch")).sendKeys("Винница, Винницкая область");
    }
}
