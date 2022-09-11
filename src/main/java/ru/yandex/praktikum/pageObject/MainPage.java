package ru.yandex.praktikum.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class MainPage extends BasePage {

    //Кнопка Куки
    private final By cookieButton = By.className("App_CookieButton__3cvqF");

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickCookieButton() {
        webDriver.findElement(cookieButton).click();
    }
}