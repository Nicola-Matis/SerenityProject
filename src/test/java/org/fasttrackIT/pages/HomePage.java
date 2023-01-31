package org.fasttrackIT.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://testfasttrackit.info/selenium-test/")
public class HomePage extends BasePage {

    @FindBy(css = ".skip-account .label")
    private WebElementFacade accountButton;

    public void clickAccountButton() {
        clickOn(accountButton);
    }

    @FindBy(xpath = "//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/ul/li[1]/a/img")
    private WebElementFacade Item1;

    @FindBy(css = "[title='Log In']")
    private WebElementFacade loginLink;

    public void clickLoginLink() {
        clickOn(loginLink);
    }

    @FindBy(css = "[title='Log Out']")
    private WebElementFacade logoutLink;

    public void clickLogoutLink() {
        clickOn(logoutLink);
    }

    @FindBy(id = "search")
    private WebElementFacade searchField;

    public void setSearchField(String searchValue) {
        typeInto(searchField, searchValue);
    }

    @FindBy(css = ".skip-cart .label")
    private WebElementFacade Cart;

    public void clickCart() {
        clickOn(Cart);
    }

    @FindBy(css = "[title='Search']")
    private WebElementFacade searchButton;

    public void clickSearchButton() {
        clickOn(searchButton);
    }

    @FindBy(css = "[title='Register']")
    private WebElementFacade registerLink;

    public void clickRegisterButton() {
        clickOn(registerLink);
    }

    public void clickItem1() {
        clickOn(Item1);
    }

    @FindBy(xpath = "//*[@id=\"header-cart\"]/div[3]/p[2]")
    private WebElementFacade EmptyCart;

    public boolean isCartOpened(String CartMessage) {
        return EmptyCart.containsOnlyText(CartMessage);

    }
}