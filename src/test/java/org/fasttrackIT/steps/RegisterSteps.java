package org.fasttrackIT.steps;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackIT.pages.HomePage;
import org.fasttrackIT.pages.LoginPage;
import org.fasttrackIT.pages.RegisterPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterSteps extends ScenarioSteps {

    private LoginPage loginPage;
    private HomePage homePage;
    private RegisterPage registerPage;

    @Step
    public void RegisterTest(){
        homePage.open();
        homePage.clickAccountButton();
        homePage.clickRegisterButton();
        registerPage.setNameField1("Vladimir");
        registerPage.setNameField2("Putin");
        registerPage.setNameField3("Vladimirochi");
        registerPage.setEmailField("vladimirputin@mail.ru");
        registerPage.setPassWordField("mustcrushcapitalism123");
        registerPage.setPassWordField2("mustcrushcapitalism123");
        registerPage.setNewsLetter();

        //Nu e nevoie de test pentru ca user-ul ramane pe pagina
    }
}
