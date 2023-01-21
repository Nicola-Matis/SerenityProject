package org.fasttrackIT.steps;

import net.thucydides.core.annotations.Step;

public class WishlistSteps extends BaseSteps {

    @Step
    public void AddItem1ToWishlist(){
        productsPage.clickSaleCategory();
        productsPage.clickAddToWishlistFromCategory();
        accountPage.Item1WasAddedWishlist();
    }
}
