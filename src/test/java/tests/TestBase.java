package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

import static java.util.concurrent.TimeUnit.SECONDS;

public class TestBase {


    public static WebDriver driver;
    static ChromeDriverService service;
    public static WebDriverWait wait;
    private final static String PATH_TO_CHROMEDRIVER = "driver/chromedriver";


    public TestBase() {
        try {
            service = new ChromeDriverService.Builder()
                    .usingDriverExecutable(new File(PATH_TO_CHROMEDRIVER))
                    .usingAnyFreePort()
                    .build();
            service.start();

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("...", true);
            ChromeOptions option = new ChromeOptions();

            driver = new RemoteWebDriver(service.getUrl(), option);

            driver.manage().timeouts().implicitlyWait(10, SECONDS);
            driver.manage().timeouts().pageLoadTimeout(20, SECONDS);
            wait = new WebDriverWait(driver, 15);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void goToURL(String url, boolean maximizeWindow) {
        driver.get(url);
        if (maximizeWindow) {
            driver.manage().window().maximize();
        }
    }

    public boolean isElementDisplayed(String xpathLocator) {
        return (driver.findElement(By.xpath(xpathLocator)).isDisplayed());
    }

    public boolean isPageTitleContained(String text) {
        String title = driver.getTitle();
        boolean result = false;
        if (title.contains(text)) result = true;
        return result;
    }

}
