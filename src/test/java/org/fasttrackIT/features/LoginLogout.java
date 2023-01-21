package org.fasttrackIT.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fasttrackIT.steps.LoginSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginLogout {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    private LoginSteps loginSteps;

    @Before
    public void maximiseBrowser(){
        driver.manage().window().maximize();
    }

    @Test
    public void LoginLogout(){
        loginSteps.doLogin("vladimirputin@mail.ru","mustcrushcapitalism123" );
        loginSteps.userIsLoggedIn("Vladimir Putin Vladimirochi");
        loginSteps.LogOutOfAccount();
        loginSteps.userIsLoggedOut("You have logged out and will be redirected to our homepage in 5 seconds.");
    }
}
