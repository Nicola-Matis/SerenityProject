package org.fasttrackIT.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackIT.pages.AccountPage;
import org.fasttrackIT.pages.HomePage;
import org.fasttrackIT.pages.LoginPage;
import org.fasttrackIT.pages.ProductsPage;
import org.junit.Assert;

public class CartSteps extends ScenarioSteps {

    private AccountPage accountPage;
    private HomePage homePage;
    private LoginPage loginPage;
    private ProductsPage productsPage;

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
