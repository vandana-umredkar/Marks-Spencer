package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonFunctions;

public class SignOutPage {
    public SignOutPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    CommonFunctions commonFunctions = new CommonFunctions();
    @FindBy(xpath = "//*[@id=\"menuBarTop\"]/div[3]/button/i")
    WebElement languageIcon;
    @FindBy(xpath = "//*[@id=\"SubCategory_25782880_menu\"]")
    WebElement school;
    @FindBy(xpath = "//*[@id=\"SC_Level_1_1_menu\"]")
    WebElement women;
    @FindBy(xpath = "//*[@id=\"SC_Level_1_586_menu\"]")
    WebElement men;
    @FindBy(xpath = "//*[@id=\"SubCategory_25782880\"]/div[1]/div[1]/ul/li[5]/a")
    WebElement dresses;

    public void validateSignOutPage()
    {
        languageIcon.isDisplayed();
    }
    public void schoolMouseHovering()
    {
        commonFunctions.mouseHover(school);
    }
    public void clickDresses()
    {
        dresses.click();
    }
}
