package org.fasttrackIT.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage{

    @FindBy(css = "#nav > ol > li.level0.nav-5.parent > a") //.active .has-children
    private WebElementFacade saleCategory;

    public void clickSaleCategory(){
        clickOn(saleCategory);
    }

    @FindBy(css = ".add-to-links .link-wishlist")
    private WebElementFacade addToWishlistFromCategory;

    public void clickAddToWishlistFromCategory(){
        clickOn(addToWishlistFromCategory);
    }

    @FindBy(xpath = "//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div[2]/div[2]/div[3]/ul/li/div/div[2]/ul/li[2]/a")
    private WebElementFacade compareItem;

    public void clickCompareItem(){
        clickOn(compareItem);
    }

    @FindBy(css = ".main-container .note-msg")
    private WebElementFacade emptySearchResult;

    public boolean isSearchResultVisible(String searchResult) {
        return emptySearchResult.containsOnlyText(searchResult);
    }

    @FindBy(css = ".add-to-cart-buttons .btn-cart")
    private WebElementFacade addToCartButton;

    public void clickAddToCartButton(){
        clickOn(addToCartButton);
    }
}
