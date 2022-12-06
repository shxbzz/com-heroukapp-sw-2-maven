package login.com.herokuapp.internet_the.testsuite;

import login.com.herokuapp.internet_the.pages.LoginPage;
import login.com.herokuapp.internet_the.pages.SecureAreaPage;
import login.com.herokuapp.internet_the.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    LoginPage loginPage = new LoginPage();
    SecureAreaPage secureAreaPage = new SecureAreaPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickLoginInButton();
        String expectedMessage = "Secure Area";
        String actualMessage = secureAreaPage.getSecureAreaText();
        Assert.assertEquals(expectedMessage, actualMessage, "Secure Area page not displayed");
    }

    @Test
    public void verifyTheUsernameErrorMessage() {
        loginPage.enterUsername("tomsmith1");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickLoginInButton();
        String expectedErrorMessage = "Your username is invalid!";
        String actualErrorMessage = loginPage.getUsernameErrorMessage();
        String actualTextFinal=actualErrorMessage.substring(0,25);
        Assert.assertEquals(expectedErrorMessage, actualTextFinal, "Username is invalid!");
    }

    @Test
    public void verifyThePasswordErrorMessage() {
        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecretPassword");
        loginPage.clickLoginInButton();
        String expectedErrorMessage = "Your password is invalid!";
        String actualErrorMessage = loginPage.getPasswordErrorMessage();
        String actualTextFinal=actualErrorMessage.substring(0,25);
        Assert.assertEquals(expectedErrorMessage, actualTextFinal, "Password is invalid!");
    }
}