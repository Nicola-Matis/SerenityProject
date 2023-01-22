package org.fasttrackIT.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackIT.pages.CartPage;
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

    @Step
    public void clickAddToCart() {
        productsPage.clickAddToCartButton();
    }

    @Step
    public void verifyProductWasAddedToCart(String productName) {
        Assert.assertTrue("Product was not added to cart!", cartPage.wasProductAddedToCart(productName));
    }

}
