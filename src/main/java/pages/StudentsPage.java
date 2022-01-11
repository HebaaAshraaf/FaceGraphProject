package pages;

import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class StudentsPage extends page{

    private final String faceGraphAdd = "faceGraph.students.add.xpath";
    private final String faceGraphAddHeader = "faceGraph.students.add.header.xpath";

    public StudentsPage(WebDriver driver) throws IOException {
        super(driver);
    }

    public void clickOnAddButton(){
        elements.locators.getElementByXpath(faceGraphAdd, driver, prop).click();
    }

    public String getTheHeaderValueOfAddmenu(){
        return elements.locators.getElementByXpath(faceGraphAddHeader, driver, prop).getText();
    }
}
