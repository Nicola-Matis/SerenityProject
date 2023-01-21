package org.fasttrackIT.features;

import org.junit.Test;

public class LoginLogout extends BaseTest{

    @Test
    public void LoginLogout(){
        loginSteps.doLogin("vladimirputin@mail.ru","mustcrushcapitalism123" );
        loginSteps.userIsLoggedIn("Vladimir Putin Vladimirochi");
        loginSteps.LogOutOfAccount();
        loginSteps.userIsLoggedOut("You have logged out and will be redirected to our homepage in 5 seconds.");
    }
}
