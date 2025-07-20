package ui_tests;

import manager.AppManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoadDelayPage;
import utils.HomePageMenuItem;

import static pages.BasePage.*;

public class LoadDelayPageTests extends AppManager {
    @Test
    public void loadDelayTests(){
       new HomePage(getDriver());
        LoadDelayPage loadDelayPage = clickButtonsHomePageMenuItem(HomePageMenuItem.LOAD_DELAY);
        Assert.assertTrue(loadDelayPage.validateUrl("loaddelay"));
    }

}
