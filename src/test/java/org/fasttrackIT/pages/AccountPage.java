package org.fasttrackIT.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {

    @FindBy(css = ".buttons-set .button")
    private WebElementFacade RegisterButton;

    @FindBy(css = ".hello strong")
    private WebElementFacade welcomeTextElement;

    public String getWelcomeText() {
        return welcomeTextElement.getText();
    }

    @FindBy(xpath = "//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div/p")
    private WebElementFacade goodbyeTextElement;

    public String getGoodbyeText() {
        return goodbyeTextElement.getText();
    }

    @FindBy(css = ".skip-active .empty")
    private WebElementFacade EmptyCartElement;

    public String getEmptyCartElement() {
        return EmptyCartElement.getText();
    }

    public boolean isWelcomeText(String userName) {
        return welcomeTextElement.containsOnlyText("Hello, " + userName + "!");
    }

    public void userIsLoggedIn(String userName) {
        welcomeTextElement.shouldContainOnlyText("Hello, " + userName + "!");
    }

    public boolean isGoodByeText(String LogOutMessage) {
        return goodbyeTextElement.containsOnlyText(LogOutMessage);
    }

    public void userIsLoggedOut(String LogOutMessage) {
        goodbyeTextElement.shouldContainOnlyText(LogOutMessage);
    }

    @FindBy(xpath = "//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div[2]/div[2]/div[1]/ul/li/ul/li/span")
    private WebElementFacade Item1WishlistConfirmationMessage;

    public void Item1WasAddedWishlist(){
        Item1WishlistConfirmationMessage.isDisabled();
    }

    @FindBy(xpath = "//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div[2]/div[2]/ul/li/ul/li/span")
    private WebElementFacade Item1CompareMessage;

    public void Item1WasAddedCompare(){Item1CompareMessage.isDisplayed();}
}
