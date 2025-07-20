package ui_tests;

import manager.AppManager;
import org.openqa.selenium.ElementClickInterceptedException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HiddenLayersPage;
import pages.HomePage;
import utils.HomePageMenuItem;


public class HiddenLayersTests extends AppManager {
    HiddenLayersPage hiddenLayersPage;

    @Test
    public void hiddenLayersTest() {
        new HomePage(getDriver());
        hiddenLayersPage = BasePage.clickButtonsHomePageMenuItem(HomePageMenuItem.HIDDEN_LAYERS);

        try {
            hiddenLayersPage.validateBtnCanNotBeHitTwice();

            // If no exception was thrown, this is a test failure
            throw new AssertionError("Expected ElementClickInterceptedException was not thrown on second click.");
        } catch (ElementClickInterceptedException e) {
            System.out.println("✅ Expected exception caught: " + e.getMessage());
        }
    }

}