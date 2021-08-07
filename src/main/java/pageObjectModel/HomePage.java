package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonFunctions;

public class HomePage extends CommonFunctions {
    public HomePage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"grey_login_btn_green_pulse\"]/span")
    WebElement signInMouseHover;
    @FindBy(xpath = "//*[@id=\"menuBarTop\"]/div[4]/div/div/ul/li[1]/a")
    WebElement signIn;

    public void signInMouseHovering()
    {

        mouseHover(signInMouseHover);
    }
    public void clickSignIn() throws InterruptedException {
        Thread.sleep(3000);
        signIn.click();
    }

}
