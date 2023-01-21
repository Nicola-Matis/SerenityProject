package org.fasttrackIT.features;

import com.sun.xml.bind.v2.runtime.reflect.opt.Const;
import org.fasttrackIT.utils.Constants;
import org.junit.Test;


public class LoginTest extends BaseTest{

    @Test
    public void LoginTest(){
        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASS);
        loginSteps.userIsLoggedIn(Constants.USER_NAME);
    }
}
