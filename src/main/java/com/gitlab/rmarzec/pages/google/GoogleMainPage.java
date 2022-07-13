package com.gitlab.rmarzec.pages.google;

import com.gitlab.rmarzec.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GoogleMainPage extends BasePage {

    public GoogleMainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#L2AGLb .QS5gu.sy4vM")
    private WebElement acceptAllCookiesButton;

    @FindBy(css = ".gLFyf.gsfi")
    private WebElement searchField;

    @FindBy(css = ".CqAVzb.lJ9FBc .RNmpXc")
    private WebElement luckyShotButton;

    public void shouldClickAcceptAllCookiesButton() {
        wait.until(ExpectedConditions.elementToBeClickable(acceptAllCookiesButton));
        click(acceptAllCookiesButton);
    }

    public void shouldSetTextToTheSearchField(String text) {
        sendKeys(searchField, text);
    }

    public void shouldClickLuckyShotButtonAndVerifyPageUrl(String w3SchoolsUrl) {
        wait.until(ExpectedConditions.elementToBeClickable(luckyShotButton));
        click(luckyShotButton);

        System.out.println(driver.getCurrentUrl());

        if (driver.getCurrentUrl().equals(w3SchoolsUrl)) {
            System.out.println("The Page is correct");
        } else {
            System.out.println("The page is not correct!!" + "\nYou entered to the: " + driver.getCurrentUrl());

            System.out.println("You will be redirected to the correct page in a moment!!");
            driver.get(w3SchoolsUrl);
        }

    }

}
