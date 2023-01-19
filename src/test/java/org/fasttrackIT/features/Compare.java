package org.fasttrackIT.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackIT.steps.CompareSteps;
import org.fasttrackIT.steps.LoginSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class Compare {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private CompareSteps compareSteps;

    @Before
    public void maximiseBrowser() {
        driver.manage().window().maximize();
    }

    @Test
    public void Login() {
        loginSteps.navigateToLoginPage();
        loginSteps.typeUserEmail("vladimirputin@mail.ru");
        loginSteps.typePassword("mustcrushcapitalism123");
        loginSteps.clickLogin();
        compareSteps.CompareItem1();
    }
}
