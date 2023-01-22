package org.fasttrackIT.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    @FindBy(css = ".success-msg span")
    private WebElementFacade addedToCartMessage;

    public boolean wasProductAddedToCart(String productName) {
        return addedToCartMessage.getText().equalsIgnoreCase(productName + " was added to your shopping cart.");
    }
}