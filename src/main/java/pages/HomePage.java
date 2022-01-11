package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.io.IOException;

public class HomePage extends page {

    //The name of the locators and url data in properties file
    private final String faceGraphredToPortal = "faceGraph.home.redToPortal.xpath";

    public HomePage(WebDriver driver) throws IOException {
        super(driver);
    }

    public boolean isUserLoggedinSucc() {
        return elements.locators.getElementByXpath(faceGraphredToPortal, driver, prop).isDisplayed();
    }

    public SmileMePortalPage clickredToPortal() throws IOException {
        WebElement element = elements.locators.getElementByXpath(faceGraphredToPortal, driver, prop);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
        return new SmileMePortalPage(driver);
    }
}
