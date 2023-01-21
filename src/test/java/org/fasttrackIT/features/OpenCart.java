package org.fasttrackIT.features;

import org.junit.Test;


public class OpenCart extends BaseTest{

    @Test
    public void OpenCart(){
        cartSteps.OpenCart();
        cartSteps.isCartOpened("You have no items in your shopping cart.");
    }
}
