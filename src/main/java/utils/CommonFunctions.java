package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFunctions {
    protected static WebDriver driver;
    protected static String msUrl = "https://www.marksandspencer.com/";
    public void openBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }
    public void closeBrowser()
    {
        driver.quit();
    }
    public void mouseHover(WebElement element)
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }
    public void waitForElement(int maxTimeOut, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, maxTimeOut);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void scrollDown()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
    }
}
