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
        Assert.assertTrue(isElementDisplayed(HomePage.FIELD_FROM_CITY),"Error element isn't displayed");
        Assert.assertTrue(isElementDisplayed(HomePage.FIELD_TO_CITY),"Error element isn't displayed");
        Assert.assertTrue(isPageTitleContained("Holiday Packages"), "Title wrong");
    }

    @AfterTest
    public void postConditionStep() {
        driver.quit();
    }
}
