package org.fasttrackIT.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackIT.steps.LoginSteps;
import org.fasttrackIT.steps.WishlistSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class AddToWishlist {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private WishlistSteps wishlistSteps;

    @Before
    public void maximiseBrowser() {
        driver.manage().window().maximize();
    }

    @Test
    public void AddToWishlist() {
        loginSteps.navigateToLoginPage();
        loginSteps.typeUserEmail("vladimirputin@mail.ru");
        loginSteps.typePassword("mustcrushcapitalism123");
        loginSteps.clickLogin();
        loginSteps.userIsLoggedIn("Vladimir Putin Vladimirochi");
        wishlistSteps.AddItem1ToWishlist();
    }
}
