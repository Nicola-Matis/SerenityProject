package org.fasttrackIT.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    @FindBy(id = "firstname")
    private WebElementFacade nameField1;

    @FindBy(id = "middlename")
    private WebElementFacade nameField2;

    @FindBy(id = "lastname")
    private WebElementFacade nameField3;

    @FindBy(id = "email_address")
    private WebElementFacade emailField;

    @FindBy(id = "password")
    private WebElementFacade passWordField;

    @FindBy(id = "confirmation")
    private WebElementFacade passWordField2;

    @FindBy(css = "[title='Sign Up for Newsletter']")
    private WebElementFacade newsLetter;

    public void setNameField1(String searchValue) {
        nameField1.clear();
        typeInto(nameField1, searchValue);
    }

    public void setNameField2(String searchValue) {
        nameField2.clear();
        typeInto(nameField2, searchValue);
    }

    public void setNameField3(String searchValue) {
        nameField3.clear();
        typeInto(nameField3, searchValue);
    }

    public void setEmailField(String searchValue) {
        emailField.clear();
        typeInto(emailField, searchValue);
    }

    public void setPassWordField(String searchValue) {
        passWordField.clear();
        typeInto(passWordField, searchValue);
    }

    public void setPassWordField2(String searchValue) {
        passWordField2.clear();
        typeInto(passWordField2, searchValue);
    }

    public void setNewsLetter() {
        clickOn(newsLetter);
    }

}
