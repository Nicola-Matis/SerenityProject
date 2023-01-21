package org.fasttrackIT.steps;

import net.thucydides.core.annotations.Step;

public class LoginSteps extends BaseSteps {

    @Step
    public void navigateToLoginPage() {
        homePage.open();
        homePage.clickAccountButton();
        homePage.clickLoginLink();
    }

    @Step
    public void typeUserEmail(String email) {
        loginPage.setEmailField(email);
    }

    @Step
    public void typePassword(String password) {
        loginPage.setPasswordField(password);
    }

    @Step
    public void clickLogin() {
        loginPage.clickLoginButton();
    }

    @Step
    public void userIsLoggedIn(String userName) {
//        Assert.assertTrue(accountPage.isWelcomeText(userName));
        accountPage.userIsLoggedIn(userName);
    }

    @Step
    public void LogOutOfAccount(){
        homePage.clickAccountButton();
        homePage.clickLogoutLink();
    }

    @Step
    public void userIsLoggedOut(String LogoutMessage){
//        Assert.assertTrue(accountPage.isGoodByeText(LogoutMessage));
        accountPage.userIsLoggedOut(LogoutMessage);
    }

    @Step
    public void doLogin(String email, String pass) {
        navigateToLoginPage();
        typeUserEmail(email);
        typePassword(pass);
        clickLogin();
    }
}
