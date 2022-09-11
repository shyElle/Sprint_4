package ru.yandex.praktikum.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class OrderSecondPage extends BasePage {
    //Поле Когда привезти самокат
    private final By dateOfRentStartField = By.xpath("//input[@placeholder='* Когда привезти самокат']");

    private final By dateOfRentStartValue = By.xpath(".//div[@aria-label='Choose четверг, 22-е сентября 2022 г.']");

    private final String dateOfRentStartText = "22.09.2022";
    //Поле Срок аренды
    private final By periodOfRentField = By.xpath(".//div[@class = 'Dropdown-placeholder']");
    //Первый элемент выпадающего списка срока аренды
    private final By dayPeriodOfRentField = By.xpath(".//div[@class = 'Dropdown-option']");
    //Цвет самоката
    private final By colourOfScooterField = By.xpath("//input[@id='black']");

    //Кнопка Заказать
    private final By orderButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    //Кнопка подтверждения заказа
    private final By orderConfirmationButton = By.xpath(".//button[text()='Да']");
    //Окно успешного заказа
    private final By successOrderWindow = By.cssSelector(".Order_ModalHeader__3FDaJ");


    public OrderSecondPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void fillDateOfRentStartField() {
        webDriver.findElement(dateOfRentStartField).click();
        webDriver.findElement(dateOfRentStartField).sendKeys(dateOfRentStartText);
        webDriver.findElement(dateOfRentStartValue).click();
    }

    public void fillPeriodOfRentField() {
        webDriver.findElement(periodOfRentField).click();
        webDriver.findElement(dayPeriodOfRentField).click();
    }

    public void chooseColourOfScooterField() {
        webDriver.findElement(colourOfScooterField).click();
    }

    public void clickOrderButton() {
        webDriver.findElement(orderButton).click();
    }

    public void clickOrderConfirmationButton() {
        webDriver.findElement(orderConfirmationButton).click();
    }

    public String getSuccessOrderWindow() {
        return webDriver.findElement(successOrderWindow).getText();
    }
}

