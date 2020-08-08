package dom.ria.tests;

import org.testng.annotations.*;

public class FirstTest extends TestBase {

    @Test
    public void testPageOpening(){
        app.getTestHelper().apartmentSale();
        app.getTestHelper().secondaryHousing();
        app.getTestHelper().checkedApartments();
        app.getTestHelper().region("Винница");

        // Данный тест можно перенести в AppManager, но этого не делалось так как возможны тесты с началом
        // других сценариев. В ТЗ четких инструкций на этот счет не было.

        app.getTestHelper().priceFrom("AADD##@@>>");
        app.getTestHelper().priceTo("AADD##@@>>");
        app.getTestHelper().priceFrom("0000");
        app.getTestHelper().priceTo("9999999");
        app.getTestHelper().roomsCount1();
        app.getTestHelper().roomsCount1(); // Повторная операция позволяет снять выбранный чек-бокс
        app.getTestHelper().roomsCount2();
        app.getTestHelper().roomsCount2(); // Повторная операция позволяет снять выбранный чек-бокс
        app.getTestHelper().roomsCount3();
        app.getTestHelper().roomsCount3(); // Повторная операция позволяет снять выбранный чек-бокс
        app.getTestHelper().roomsCount4();
        app.getTestHelper().roomsCount4(); // Повторная операция позволяет снять выбранный чек-бокс

        // Вариаций данного теста может быть множество, с более сложными элементами, циклами и проверками.
        // Так как у меня был четкий дедлайн и ограниченное время - я не стал дорабатывать данные тесты.
    }
}