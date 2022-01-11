package pages;

import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class SmileMePortalPage extends page{

    private final String faceGraphMenu = "faceGraph.smileportal.menu.xpath";
    private final String faceGraphManageAtt = "faceGraph.smileportal.manageattendance.xpath";
    private final String faceGraphStudents = "faceGraph.smileportal.students.xpath";


    public SmileMePortalPage(WebDriver driver) throws IOException {
        super(driver);
    }

    public void clickOnTheMenu(){
        elements.locators.getElementByXpath(faceGraphMenu, driver, prop).click();
    }

    public void clickOnManageAtt(){
        elements.locators.getElementByXpath(faceGraphManageAtt, driver, prop).click();
    }

    public StudentsPage clickOnStudents() throws IOException {
        elements.locators.getElementByXpath(faceGraphStudents, driver, prop).click();
        return new StudentsPage(driver);
    }
}
