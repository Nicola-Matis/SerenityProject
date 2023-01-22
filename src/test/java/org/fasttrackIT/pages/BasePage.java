package org.fasttrackIT.pages;

import net.thucydides.core.pages.PageObject;

public class BasePage extends PageObject {

    public int getIntFromPrice(String price){
        return Integer.parseInt(price
                .replaceAll(",", "")
                .replaceAll(" RON", "")
        );
    }
}
