package ru.yandex.praktikum.tests;

import org.junit.Test;
import ru.yandex.praktikum.pageObject.MainPage;
import ru.yandex.praktikum.pageObject.OrderFirstPage;
import ru.yandex.praktikum.pageObject.OrderSecondPage;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.hamcrest.CoreMatchers.startsWith;

import org.hamcrest.MatcherAssert;


@RunWith(Parameterized.class)

public class OrderTest extends BaseTest {
    private final String userName;
    private final String userSurname;
    private final String userAddress;
    private final String userPhone;

    public OrderTest(String userName, String userSurname, String userAddress, String userPhone) {
        this.userSurname = userSurname;
        this.userName = userName;
        this.userAddress = userAddress;
        this.userPhone = userPhone;
    }

    @Parameterized.Parameters
    public static Object[][] getUsersData() {

        return new Object[][]{
                {"Джон", "Макклейн", "г Москва, ул Краснопролетарская, д 4", "+70072484012" },
                {"Антуанетта", "Семипалатинская", "г Москва, ул Килиманджарокофейная, д.234-1,345", "+70072484013" },
        };
    }

    @Test
    public void orderScooterSuccessTest() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickCookieButton();
        OrderFirstPage orderFirstPage = new OrderFirstPage(webDriver);
        orderFirstPage.clickTopOrderButton();
        orderFirstPage.fillNameField(userName);
        orderFirstPage.fillSurnameField(userSurname);
        orderFirstPage.fillAddressField(userAddress);
        orderFirstPage.fillMetroStationField();
        orderFirstPage.fillPhoneField(userPhone);
        orderFirstPage.clickNextButton();

        OrderSecondPage orderSecondPage = new OrderSecondPage(webDriver);
        orderSecondPage.fillDateOfRentStartField();
        orderSecondPage.fillPeriodOfRentField();
        orderSecondPage.chooseColourOfScooterField();
        orderSecondPage.clickOrderButton();
        orderSecondPage.clickOrderConfirmationButton();
        String actualTextOfSuccessOrder = orderSecondPage.getSuccessOrderWindow();
        MatcherAssert.assertThat("Фактический текст отличается от ожидаемого", actualTextOfSuccessOrder, startsWith("Заказ оформлен"));
    }
}
