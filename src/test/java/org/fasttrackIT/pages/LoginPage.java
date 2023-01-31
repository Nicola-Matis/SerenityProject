package org.fasttrackIT.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class LoginPage  extends BasePage {

    @FindBy(id = "email")
    private WebElementFacade emailField;

    public void setEmailField(String value) {
        typeInto(emailField, value);
    }

    @FindBy(id = "pass")
    private WebElementFacade passwordField;

    public void setPasswordField(String value) {
        typeInto(passwordField, value);
    }

    @FindBy(id = "send2")
    private WebElementFacade loginButton;

    public void clickLoginButton() {
        clickOn(loginButton);
    }
}
