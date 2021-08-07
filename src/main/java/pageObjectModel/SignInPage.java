package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonFunctions;

public class SignInPage extends CommonFunctions {

    public SignInPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"loginEmail\"]")
    WebElement emailId;
    @FindBy(id = "loginPassword")
    WebElement password;
    @FindBy(xpath = "//*[@id=\"loginForm\"]/div[4]/div/button")
    WebElement signInButton;
    @FindBy(xpath = "/html/body/div[3]/div[1]/div[3]/div/div[2]/div/div/div[1]/div/h1")
    WebElement signInText;

    public void enterEmailId(String userId)  {

        waitForElement(10, emailId);
        emailId.sendKeys(userId);
    }
    public void enterPassword(String password1)
    {
        password.sendKeys(password1);

    }
    public void clickOnSignInButton()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        scrollDown();
        signInButton.click();
    }
    public void validateSignInPage()
    {
        signInText.getText();
    }
}
