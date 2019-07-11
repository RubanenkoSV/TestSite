package site.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static tests.TestBase.driver;
import static tests.TestBase.wait;

public class BasePage {

    public void clickOn(String xpathLocator) {

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(xpathLocator))));
        driver.findElement(By.xpath(xpathLocator)).click();

    }

}
