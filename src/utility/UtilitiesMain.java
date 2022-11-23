package utility;

import browserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UtilitiesMain extends BaseTest {
    public void clickOnElement(By by){
        WebElement loginLink = driver.findElement(by);
        loginLink.click();
    }
    public void sendTextToElement(By by, String text){
        WebElement emailField = driver.findElement(by);
        emailField.sendKeys(text);

    }
    public String getTextFromElement(By by){
        WebElement actualTextFromMessageElement = driver.findElement(by);
        return actualTextFromMessageElement.getText();

    }
}
