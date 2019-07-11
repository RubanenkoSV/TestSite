package site.pages;

import org.openqa.selenium.By;

import static tests.TestBase.driver;

public class HomePage extends BasePage {

//    public static final String LINK_HOLIDAY = "//*[contains(@class,'chHeaderContainer')]//a/span[" +
//             "text()[contains(.,'Holiday')]]";

    private String LINK_ON_NAV_MENU = "//*[contains(@class,'chHeaderContainer')]//a/span[" +
            "text()[contains(.,'%s')]]";

    public static String FIELD_FROM_CITY = "//div[contains(@class,'hdsw_inputBox selectHtlCity')]/label[contains(@for, 'fromCity')]";
    public static String FIELD_TO_CITY = "//div[contains(@class,'hdsw_inputBox selectHtlCity')]/label[contains(@for, 'toCity')]";

    public void clickLinkFromNavBar(String linkName) {
        String xpathlocator = String.format(LINK_ON_NAV_MENU, linkName);
        driver.findElement(By.xpath(xpathlocator)).click();
    }


}
