package tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import site.pages.HomePage;


public class LoginTest extends TestBase {

    @BeforeTest
    public void preConditionStep() {
        goToURL("https://www.makemytrip.com/", true);
    }

    @Test
    public void login() {
        HomePage home = new HomePage();
        home.clickLinkFromNavBar("Holiday");
        Assert.assertTrue(isElementExists(HomePage.SEARCH_BUTTON), "Error: Button is absent");
        Assert.assertTrue(isElementDisplayed(HomePage.FIELD_FROM_CITY),"Error: Element isn't displayed");
        Assert.assertTrue(isElementDisplayed(HomePage.FIELD_TO_CITY),"Error: Element isn't displayed");
        Assert.assertTrue(isPageTitleContained("Holiday Packages"), "Error: Wrong title");
    }

    @AfterTest
    public void postConditionStep() {
        driver.quit();
    }
}
