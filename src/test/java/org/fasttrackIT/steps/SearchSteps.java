package org.fasttrackIT.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackIT.pages.HomePage;
import org.fasttrackIT.pages.LoginPage;
import org.fasttrackIT.pages.ProductsPage;
import org.fasttrackIT.pages.RegisterPage;
import org.junit.Assert;

public class SearchSteps extends ScenarioSteps {

    private LoginPage loginPage;
    private HomePage homePage;
    private ProductsPage productsPage;


    @Step
    public void Search() {
        homePage.open();
        homePage.setSearchField("ceaun");
        homePage.clickSearchButton();
    }

    @Step
    public void isSearchResultVisible(String searcResult){
        Assert.assertTrue(productsPage.isSearchResultVisible(searcResult));
    }
}
