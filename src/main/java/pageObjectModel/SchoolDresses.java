package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SchoolDresses {
    public SchoolDresses(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"fesk-find\"]/section/section/div[1]/h1")
    WebElement schoolDressesText;
    public void validateSchoolDressesPage()
    {
        schoolDressesText.isDisplayed();
    }
}
