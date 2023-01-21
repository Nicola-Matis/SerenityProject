package org.fasttrackIT.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CartSteps extends BaseSteps{

    @Step
    public void OpenCart() {
        homePage.open();
        homePage.clickCart();
        homePage.isCartOpened("You have no items in your shopping cart.");
    }

    @Step
    public void isCartOpened(String CartMessage) {
        Assert.assertTrue(homePage.isCartOpened(CartMessage));
    }
}
