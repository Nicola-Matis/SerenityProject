package org.fasttrackIT.steps;

import net.thucydides.core.annotations.Step;


public class CompareSteps extends BaseSteps {

    @Step
    public void CompareItem1(){
        productsPage.clickSaleCategory();
        productsPage.clickCompareItem();
        accountPage.Item1WasAddedCompare();
    }

//    WebElement Compare = driver.findElement(By.xpath("//*[@id=\"messages_product_view\"]/ul/li/ul/li/span"));
//    Assert.assertTrue(Compare.isDisplayed());

}