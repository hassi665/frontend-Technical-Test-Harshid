package co.uk.heartbingo.pages;

import co.uk.heartbingo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class);

    @FindBy(id = "onetrust-accept-btn-handler")
    WebElement acceptAllCookies;

    @FindBy(xpath = "//li[@class = 'section site-main-nav__item']//a[contains(text(), 'Casino')]")
    WebElement casinoOption;

    @FindBy(xpath = "//button[@class = 'site-header__back-button bvs-icon is-arrow-left']")
    WebElement backToHomePage;


    public void acceptAllCookies() {
        clickOnElement(acceptAllCookies);
        log.info("Clicking on Accepting All Cookies : " + acceptAllCookies.toString());
    }

    public void clickOnCasinoOption() {
        clickOnElement(casinoOption);
        log.info("Clicking on Casino option : " + casinoOption.toString());
    }

    public void clickOnBackButton() {
        clickOnElement(backToHomePage);
        log.info("Clicking on Homepage Logo : " + backToHomePage.toString());
    }


}
