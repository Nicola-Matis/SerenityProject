package org.fasttrackIT.features;

import org.junit.Test;

public class AddToWishlist extends BaseTest{

    @Test
    public void AddToWishlist() {
        loginSteps.doLogin("vladimirputin@mail.ru","mustcrushcapitalism123" );
        wishlistSteps.AddItem1ToWishlist();
    }
}
