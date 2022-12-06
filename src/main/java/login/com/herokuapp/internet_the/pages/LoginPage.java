package login.com.herokuapp.internet_the.pages;

import login.com.herokuapp.internet_the.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.xpath("//i[contains(text(),'Login')]");
    By usernameErrorMessage = By.id("flash");
    By passwordErrorMessage = By.xpath("//div[contains(text(),'Your password is invalid!')]");

    public void enterUsername(String username) {
        sendTextToElement(usernameField, username);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickLoginInButton() {
        clickOnElement(loginButton);
    }

    public String getUsernameErrorMessage() {
        return getTextFromElement(usernameErrorMessage);
    }

    public String getPasswordErrorMessage() {
        return getTextFromElement(passwordErrorMessage);
    }

}
