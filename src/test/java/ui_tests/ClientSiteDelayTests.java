package ui_tests;

import manager.AppManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.ClientSiteDelayPage;
import pages.HomePage;
import utils.HomePageMenuItem;

import static pages.BasePage.*;

public class ClientSiteDelayTests extends AppManager {
    @Test
    public void clientSiteDelayPage(){
        new HomePage (getDriver ());
        ClientSiteDelayPage clientSiteDelayPage =
                BasePage.clickButtonsHomePageMenuItem (HomePageMenuItem.CLIENT_SIDE_DELAY);
        Assert.assertTrue (clientSiteDelayPage.validateAppearText ());
    }
}
