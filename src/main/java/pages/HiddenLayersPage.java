package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.time.Duration;




public class HiddenLayersPage extends BasePage {
    public HiddenLayersPage(WebDriver driver){
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,10),this);
    }

    @FindBy(id="greenButton")
    WebElement greenBtn;

    public void validateBtnCanNotBeHitTwice() {
        System.out.println("Before first click:");
        System.out.println("isEnabled: " + greenBtn.isEnabled());
        System.out.println("isDisplayed: " + greenBtn.isDisplayed());

        greenBtn.click(); // First click

        pause(3000); // Wait for the overlay layer to appear

        System.out.println("After first click:");
        System.out.println("isEnabled: " + greenBtn.isEnabled());
        System.out.println("isDisplayed: " + greenBtn.isDisplayed());

        // Try to click the button again – this should throw an exception if it is covered
        greenBtn.click(); // Expect ElementClickInterceptedException here
    }

}
