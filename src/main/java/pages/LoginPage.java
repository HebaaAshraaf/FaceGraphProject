package pages;

import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class LoginPage extends page {

    //The name of the locators and url data in properties file
    private final String accNumberField = "faceGraph.login.accNumberField.id";
    private final String passField = "faceGraph.login.passField.id";
    private final String skipCheckBox = "faceGraph.login.skipCheckBox.id";
    private final String btnSubmit = "faceGraph.login.btnSubmit.id";

    //The path of FaceGraph login url in properties file
    private final String loginPageURL = "faceGraph.login.url";

    public LoginPage(WebDriver driver) throws IOException {
        super(driver);
        driver.get(readers.PropReader.read(loginPageURL, prop));
    }

    public void writeAccNum(String data) throws IOException {
        elements.locators.getElementByID(accNumberField,driver,prop).sendKeys(data);
    }

    public void writePass(String data) throws IOException {
        elements.locators.getElementByID(passField,driver,prop).sendKeys(data);
    }

    public void clickSkipVer() throws IOException {
        elements.locators.getElementByID(skipCheckBox,driver,prop).click();
    }

    public HomePage clickSubmit() throws IOException {
        elements.locators.getElementByID(btnSubmit, driver, prop).click();
        return new HomePage(driver);
    }
}
