package org.fasttrackIT.features;

import org.fasttrackIT.utils.Constants;
import org.junit.Test;

public class AddToWishlist extends BaseTest{

    @Test
    public void AddToWishlist() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        wishlistSteps.AddItem1ToWishlist();
    }
}
