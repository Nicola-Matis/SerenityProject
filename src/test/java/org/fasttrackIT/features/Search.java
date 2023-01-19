package org.fasttrackIT.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackIT.pages.HomePage;
import org.fasttrackIT.steps.SearchSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class Search {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    private SearchSteps searchSteps;

    @Before
    public void maximiseBrowser(){
        driver.manage().window().maximize();
    }

    @Test
    public void Search() {
        searchSteps.Search();
        searchSteps.isSearchResultVisible("Your search returns no results.");
    }
}
