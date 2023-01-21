package org.fasttrackIT.features;

import org.fasttrackIT.utils.Constants;
import org.junit.Test;


public class Compare extends BaseTest{

    @Test
    public void Login() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        compareSteps.CompareItem1();
    }
}
