package org.fasttrackIT.features;

import org.junit.Test;


public class LoginTest extends BaseTest{

    @Test
    public void LoginTest(){
        loginSteps.doLogin("vladimirputin@mail.ru","mustcrushcapitalism123" );
        loginSteps.userIsLoggedIn("Vladimir Putin Vladimirochi");
    }
}
