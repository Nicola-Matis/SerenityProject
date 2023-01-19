package org.fasttrackIT.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackIT.pages.AccountPage;
import org.fasttrackIT.pages.HomePage;
import org.fasttrackIT.pages.LoginPage;
import org.fasttrackIT.pages.ProductsPage;

public class CompareSteps extends ScenarioSteps {

    private AccountPage accountPage;
    private HomePage homePage;
    private LoginPage loginPage;
    private ProductsPage productsPage;

    @Step
    public void CompareItem1(){
        productsPage.clickSaleCategory();
        productsPage.clickCompareItem();
        accountPage.Item1WasAddedCompare();
    }

//    WebElement Compare = driver.findElement(By.xpath("//*[@id=\"messages_product_view\"]/ul/li/ul/li/span"));
//    Assert.assertTrue(Compare.isDisplayed());

}