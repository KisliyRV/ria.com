package dom.ria.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
    }

    public void region(String City) {
        driver.findElement(By.id("autocompleteSearch")).sendKeys(City);
        driver.findElement(By.id("leftFilterForm")).submit();
        driver.findElement(By.xpath("//div[@id='remote']/label/span/div/div/div")).click();
    }

    public void priceFrom(String From) {
        driver.findElement(By.id("characteristic_234_from")).click();
        driver.findElement(By.id("characteristic_234_from")).sendKeys(From);

    }

    public void priceTo(String To) {
        driver.findElement(By.id("characteristic_234_to")).click();
        driver.findElement(By.id("characteristic_234_to")).sendKeys(To);
    }

    public void roomsCount1() {
        driver.findElement(By.xpath("//span[@id='roomsCountBtns']/span/label")).click();
    }

    public void roomsCount2() {
        driver.findElement(By.xpath("//span[@id='roomsCountBtns']/span/label[2]")).click();
    }

    public void roomsCount3() {
        driver.findElement(By.xpath("//span[@id='roomsCountBtns']/span/label[3]")).click();
    }

    public void roomsCount4() {
        driver.findElement(By.xpath("//span[@id='roomsCountBtns']/span/label[4]")).click();
    }
}
