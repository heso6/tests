package com.gitlab.rmarzec.pages.youTube;

import com.gitlab.rmarzec.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


import java.util.List;

public class YouTubeMainPage extends BasePage {

    public YouTubeMainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[aria-label='Zaakceptuj wykorzystywanie plików cookie i innych danych do opisanych celów']")
    private WebElement acceptAllCookiesButton;

    @FindBy(css = ".style-scope.ytd-rich-grid-row")
    private List<WebElement> gridElement;


    public void shouldClickAcceptAllCookiesButton() {
        wait.until(ExpectedConditions.elementToBeClickable(acceptAllCookiesButton));
        click(acceptAllCookiesButton);
    }

    public void shouldAddElementsToTheList() {
        wait.until(ExpectedConditions.visibilityOfAllElements(gridElement));
        for (WebElement element : gridElement) {
            System.out.println(element.getText());

        }

    }

}
