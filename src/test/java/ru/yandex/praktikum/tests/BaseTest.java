package ru.yandex.praktikum.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    protected WebDriver webDriver;
    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        //WebDriverManager.firefoxdriver().setup();
        webDriver = new ChromeDriver();
       //  webDriver = new FirefoxDriver();
        webDriver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        webDriver.get("https://qa-scooter.praktikum-services.ru/");
    }
    @After
    public void tearDown() {
        webDriver.quit();
    }

}
