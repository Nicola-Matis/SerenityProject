package org.fasttrackIT.features;

import org.fasttrackIT.utils.Constants;
import org.junit.Test;

public class CartTest extends BaseTest {
    private String productName = "SILVER DESERT NECKLACE";

    @Test
    public void addToCartTest() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.goToProductDetailsPage(productName);
        cartSteps.clickAddToCart();
        cartSteps.verifyProductWasAddedToCart(productName);
    }
}
