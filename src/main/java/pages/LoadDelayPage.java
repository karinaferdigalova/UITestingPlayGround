package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoadDelayPage extends BasePage {
    public LoadDelayPage(WebDriver driver){
        setDriver(driver);
        driver.get("http://uitestingplayground.com/");
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,10),this);
    }
}
