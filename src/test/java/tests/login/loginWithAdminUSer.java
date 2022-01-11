package tests.login;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchSessionException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import readers.JSONReader;
import tests.base.BaseTest;

import java.io.IOException;

public class loginWithAdminUSer extends BaseTest {
    @DataProvider
    public Object[][] jsonData() {
        return JSONReader.JsonReader();
    }

    @Test(dataProvider = "jsonData")
    public void checkSearchResultsNumbersInBothPagesTest(String username, String password) {
        try {
            loginPage.writeAccNum(username);
            loginPage.writePass(password);
            loginPage.clickSkipVer();
            HomePage homePage = loginPage.clickSubmit();
            Assert.assertTrue(homePage.isUserLoggedinSucc());
        } catch (InvalidSelectorException e) {
            exceptions.ExceptionsMessages.InvalidSelectorMsg(e);
        } catch (NoSuchElementException e) {
            exceptions.ExceptionsMessages.NoSuchElementMsg(e);
        } catch (ElementNotVisibleException e) {
            exceptions.ExceptionsMessages.ElementNotVisibleMsg(e);
        } catch (NoSuchSessionException e) {
            exceptions.ExceptionsMessages.NoSuchSessionMsg(e);
        } catch (NullPointerException e) {
            exceptions.ExceptionsMessages.NullPointerMsg(e);
        } catch (IOException e) {
            exceptions.ExceptionsMessages.IOMsg(e);
        }
    }
}
