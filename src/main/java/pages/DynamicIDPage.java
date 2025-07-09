package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class DynamicIDPage extends  BasePage {
    public DynamicIDPage(WebDriver driver){
        setDriver(driver);
        driver.get("http://uitestingplayground.com/");
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,10),this);
    }
}
