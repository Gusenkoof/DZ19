package steps;

import com.codeborne.selenide.ElementsCollection;
import io.cucumber.java.ru.Допустим;
import io.cucumber.java.ru.Тогда;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Steps extends LocatorsPage{

    @Допустим("открыта страница \"([^\"]*)\"$")
    public void openUrl(String pageURL) {
        open(pageURL);
        getWebDriver().manage().window().maximize();
        String currentPageURL = getWebDriver().getCurrentUrl();
        assertEquals(pageURL, currentPageURL, "Значения ссылок не сопадают");
    }

        @Допустим("введен логин \"([^\"]*)\"$")
    public void usernameEntering(String userName) {
        userNameForm.sendKeys(userName);

    }
    @Допустим("введен пароль \"([^\"]*)\"$")
    public void passwordEntering(String password) {
        passwordForm.sendKeys(password);

    }
    @Допустим("нажата кнопка авторизации")
    public void clickLoginButton() {
        loginButton.click();

    }
    @Тогда("на странице появляется надпись \"([^\"]*)\"$")
    public void presenceInscription(String inscript) {
        Assertions.assertEquals(inscript, startMessage.getText(), "Вы зашли не на ту страницу");
    }

    @Тогда("переходим на страницу \"([^\"]*)\"$")
    public void productsUrl(String products) {
        String currentUrl = getWebDriver().getCurrentUrl();
        assertEquals(products, currentUrl, "Значения ссылок не сопадают");

    }

    @Тогда("нажата кнопка добавления первого товара в корзину")
    public void addToCart() {
        backpackAdd.click();

    }
    @Тогда("нажата кнопка перехода в корзину")
    public void clickToCart() {
        basketButton.click();

    }
    @Тогда("добавленный товар окажется в корзине")
    public void productsToCart() {
        String product = productName.getText();
        Assertions.assertEquals("Sauce Labs Backpack", product, "Вы добавили не тот товар");

    }
    //Сделал этот метод через коллекции, как и в прошлом заднии, хотя здесь добавлен только один товар
    //так как не смог разобраться как через ассерты проверить отстутсвия элемента на странице
    @Тогда("нажата кнопка удаления из корзины")
    public void removeClick() {
        ElementsCollection removeButtonBefore = $$(By.xpath("//button[text()='Remove']"));
        int remBttSizeBefore = removeButtonBefore.size();
        for (int i = 0; i < remBttSizeBefore; i++){
            removeButtonBefore.first().click();
        }
    }

    @Тогда("товар исчезнет из карзины")
    public void deletingProduct() {
        $$(By.xpath("//button[text()='Remove']")).shouldHave(size(0));
    }



}
