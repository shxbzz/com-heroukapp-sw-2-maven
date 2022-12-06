package login.com.herokuapp.internet_the.pages;

import login.com.herokuapp.internet_the.utility.Utility;
import org.openqa.selenium.By;

public class SecureAreaPage extends Utility {

    By secureAreaTxt = By.xpath("//h2[contains(text(),'Secure Area')]");


    public String getSecureAreaText() {
        return getTextFromElement(secureAreaTxt);
    }
}
