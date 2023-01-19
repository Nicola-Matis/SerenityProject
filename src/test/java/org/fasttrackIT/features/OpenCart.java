package org.fasttrackIT.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackIT.pages.HomePage;
import org.fasttrackIT.steps.CartSteps;
import org.fasttrackIT.steps.CompareSteps;
import org.fasttrackIT.steps.LoginSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class OpenCart {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    private CartSteps cartSteps;

    @Before
    public void maximiseBrowser(){
        driver.manage().window().maximize();
    }

    @Test
    public void OpenCart(){
        cartSteps.OpenCart();
        cartSteps.isCartOpened("You have no items in your shopping cart.");
    }
}
