package org.fasttrackIT.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackIT.pages.AccountPage;
import org.fasttrackIT.pages.HomePage;
import org.fasttrackIT.pages.LoginPage;
import org.fasttrackIT.pages.ProductsPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WishlistSteps extends ScenarioSteps {

    private AccountPage accountPage;
    private HomePage homePage;
    private LoginPage loginPage;
    private ProductsPage productsPage;


    @Step
    public void AddItem1ToWishlist(){
        productsPage.clickSaleCategory();
        productsPage.clickAddToWishlistFromCategory();
        accountPage.Item1WasAddedWishlist();
    }
}
