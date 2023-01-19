package org.fasttrackIT.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackIT.steps.RegisterSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class RegisterTest {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    private RegisterSteps registerSteps;

    @Before
    public void maximiseBrowser(){
        driver.manage().window().maximize();
    }

    @Test
    public void RegisterTest(){
        registerSteps.RegisterTest();
    }
}
