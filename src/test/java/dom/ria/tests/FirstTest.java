package dom.ria.tests;

import org.testng.annotations.*;

public class FirstTest extends TestBase {

    @Test
    public void testAddProduct(){
        app.getTestHelper().apartmentSale();
        app.getTestHelper().secondaryHousing();
        app.getTestHelper().checkedApartments();
        app.getTestHelper().region("Винница");
    }
}