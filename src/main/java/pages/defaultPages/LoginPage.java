package pages.defaultPages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import webApplication.Application;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends Page {
    private final SelenideElement
            USERNAME_INPUT_FIELD = $(By.id("username")),
            PASSWORD_INPUT_FIELD = $(By.id("password")),
            SUBMIT_BUTTON = $(By.cssSelector("[type='submit']")),
            FORGET_PASSWORD_BUTTON = $(By.xpath("//*[contains(text(),'Забыли')]"));

    public LoginPage(String href) {
        super(href);
    }

    public InformationPanelPage login(String username, String password){
        USERNAME_INPUT_FIELD.setValue(username);
        PASSWORD_INPUT_FIELD.setValue(password);
        SUBMIT_BUTTON.click();

        return Application.informationPanelPage;
    }
}
