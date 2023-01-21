package org.fasttrackIT.steps;

import net.thucydides.core.annotations.Step;

public class RegisterSteps extends BaseSteps {

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
