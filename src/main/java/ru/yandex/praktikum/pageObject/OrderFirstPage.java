package ru.yandex.praktikum.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class OrderFirstPage extends BasePage {
    // Кнопка «Заказать» наверху
    private final By topOrderButton = By.xpath(".//button[@class='Button_Button__ra12g']");
    //Поле Имя
    private final By nameField = By.xpath("//input[@placeholder='* Имя']");
    //Фамилия
    private final By surnameField = By.xpath("//input[@placeholder='* Фамилия']");
    //Адрес
    private final By addressField = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    //Метро
    private final By metroStationField = By.xpath("//input[@placeholder='* Станция метро']");
    //Метро выбор станции
    private final By metroStationValue = By.xpath(".//button[@value='4']");
    private final String metroStationText = "Сокольники";

    //Телефон
    private final By phoneField = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    // Кнопка «Далее»
    private final By nextButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    public OrderFirstPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickTopOrderButton() {
        webDriver.findElement(topOrderButton).click();
    }

    public String fillNameField(String name) {
        webDriver.findElement(nameField).sendKeys(name);
        return name;
    }

    public String fillSurnameField(String surname) {
        webDriver.findElement(surnameField).sendKeys(surname);
        return surname;
    }

    public String fillAddressField(String address) {
        webDriver.findElement(addressField).sendKeys(address);
        return address;
    }

    public void fillMetroStationField() {
        webDriver.findElement(metroStationField).click();
        webDriver.findElement(metroStationField).sendKeys(metroStationText);
        webDriver.findElement(metroStationValue).click();
    }

    public String fillPhoneField(String phone) {
        webDriver.findElement(phoneField).sendKeys(phone);
        return phone;
    }

    public void clickNextButton() {
        webDriver.findElement(nextButton).click();
    }
}