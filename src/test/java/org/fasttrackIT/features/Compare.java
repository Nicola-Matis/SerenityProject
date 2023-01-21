package org.fasttrackIT.features;

import org.junit.Test;


public class Compare extends BaseTest{

    @Test
    public void Login() {
        loginSteps.doLogin("vladimirputin@mail.ru","mustcrushcapitalism123" );
        compareSteps.CompareItem1();
    }
}
