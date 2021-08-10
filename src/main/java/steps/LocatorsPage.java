package steps;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class LocatorsPage {
    SelenideElement userNameForm = $(By.id("user-name"));
    SelenideElement passwordForm = $(By.id("password"));
    SelenideElement loginButton = $(By.id("login-button"));
    SelenideElement startMessage = $(By.className("title"));
    SelenideElement backpackAdd = $(By.id("add-to-cart-sauce-labs-backpack"));
    SelenideElement basketButton = $(By.className("shopping_cart_link"));
    SelenideElement productName = $(By.className("inventory_item_name"));

}
