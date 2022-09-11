package ru.yandex.praktikum.tests;

import org.junit.Test;
import ru.yandex.praktikum.pageObject.MainPage;
import ru.yandex.praktikum.pageObject.QuestionsPage;

import static org.junit.Assert.assertEquals;

public class QuestionsTest extends BaseTest {

    @Test
    public void checkFirstAnswerTest() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickCookieButton();
        QuestionsPage questionsPage = new QuestionsPage(webDriver);
        questionsPage.clickFirstQuestionButton();
        assertEquals("Ответ не соответствует вопросу", "Сутки — 400 рублей. Оплата курьеру — наличными или картой.", questionsPage.getFirstAnswer());
    }

    @Test
    public void checkSecondAnswerTest() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickCookieButton();
        QuestionsPage questionsPage = new QuestionsPage(webDriver);
        questionsPage.clickSecondQuestionButton();
        assertEquals("Ответ не соответствует вопросу", "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", questionsPage.getSecondAnswer());
    }

    @Test
    public void checkThirdAnswerTest() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickCookieButton();
        QuestionsPage questionsPage = new QuestionsPage(webDriver);
        questionsPage.clickThirdQuestionButton();
        assertEquals("Ответ не соответствует вопросу", "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", questionsPage.getThirdAnswer());
    }

    @Test
    public void checkFourthAnswerTest() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickCookieButton();
        QuestionsPage questionsPage = new QuestionsPage(webDriver);
        questionsPage.clickFourthQuestionButton();
        assertEquals("Ответ не соответствует вопросу", "Только начиная с завтрашнего дня. Но скоро станем расторопнее.", questionsPage.getFourthAnswer());
    }

    @Test
    public void checkFifthAnswerTest() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickCookieButton();
        QuestionsPage questionsPage = new QuestionsPage(webDriver);
        questionsPage.clickFifthQuestionButton();
        assertEquals("Ответ не соответствует вопросу", "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.", questionsPage.getFifthAnswer());

    }

    @Test
    public void checkSixthAnswerTest() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickCookieButton();
        QuestionsPage questionsPage = new QuestionsPage(webDriver);
        questionsPage.clickSixthQuestionButton();
        assertEquals("Ответ не соответствует вопросу", "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.", questionsPage.getSixthAnswer());
    }

    @Test
    public void checkSeventhAnswerTest() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickCookieButton();
        QuestionsPage questionsPage = new QuestionsPage(webDriver);
        questionsPage.clickSeventhQuestionButton();
        assertEquals("Ответ не соответствует вопросу", "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.", questionsPage.getSeventhAnswer());

    }

    @Test
    public void checkEighthAnswerTest() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickCookieButton();
        QuestionsPage questionsPage = new QuestionsPage(webDriver);
        questionsPage.clickEighthQuestionButton();
        assertEquals("Ответ не соответствует вопросу", "Да, обязательно. Всем самокатов! И Москве, и Московской области.", questionsPage.getEighthAnswer());
    }
}
