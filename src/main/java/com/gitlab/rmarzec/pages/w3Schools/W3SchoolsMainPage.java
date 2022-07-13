package com.gitlab.rmarzec.pages.w3Schools;

import com.gitlab.rmarzec.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class W3SchoolsMainPage extends BasePage {

    public W3SchoolsMainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#accept-choices")
    private WebElement acceptAllCookies;

    @FindBy(css = "a[href='tryit.asp?filename=tryhtml_select']")
    private WebElement firstTryItYourselfButton;


    public void shouldClickAcceptAllCookies() {
        wait.until(ExpectedConditions.elementToBeClickable(acceptAllCookies));
        click(acceptAllCookies);
    }

    public void shouldClickFirstTryItYourselfButton(){
        click(firstTryItYourselfButton);

    }

}
