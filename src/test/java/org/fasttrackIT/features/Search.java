package org.fasttrackIT.features;

import org.junit.Test;


public class Search extends BaseTest{

    @Test
    public void Search() {
        searchSteps.Search();
        searchSteps.isSearchResultVisible("Your search returns no results.");
    }
}
