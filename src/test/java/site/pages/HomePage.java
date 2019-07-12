package site.pages;

public class HomePage extends BasePage {

    private String LINK_ON_NAV_MENU = "//*[contains(@class,'chHeaderContainer')]//a/span[" +
            "text()[contains(.,'%s')]]";
    public static String FIELD_FROM_CITY = "//div[contains(@class,'hdsw_inputBox selectHtlCity')]/" +
            "label[contains(@for, 'fromCity')]";
    public static String FIELD_TO_CITY = "//div[contains(@class,'hdsw_inputBox selectHtlCity')]/" +
            "label[contains(@for, 'toCity')]";
    public static String SEARCH_BUTTON = "//button[text()[contains(.,'Search')]]";

    public void clickLinkFromNavBar(String linkName) {
        clickOnElement(String.format(LINK_ON_NAV_MENU, linkName));
    }


}
