package org.fasttrackIT.features;

import com.sun.xml.bind.v2.runtime.reflect.opt.Const;
import org.fasttrackIT.utils.Constants;
import org.junit.Test;

public class LoginLogout extends BaseTest{

    @Test
    public void LoginLogout(){
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        loginSteps.userIsLoggedIn(Constants.USER_NAME);
        loginSteps.LogOutOfAccount();
        loginSteps.userIsLoggedOut("You have logged out and will be redirected to our homepage in 5 seconds.");
    }
}
