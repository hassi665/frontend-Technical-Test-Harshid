package co.uk.heartbingo.testsuite;

import co.uk.heartbingo.pages.HomePage;
import co.uk.heartbingo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    HomePage homePage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
    }

    @Test
    public void verifyUserShouldNavigateToHomePage()  {
        homePage.acceptAllCookies();
        homePage.clickOnCasinoOption();
        homePage.clickOnBackButton();
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.heartbingo.co.uk/", "home page not display");
    }
}
