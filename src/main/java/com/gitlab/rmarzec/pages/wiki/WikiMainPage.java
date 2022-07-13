package com.gitlab.rmarzec.pages.wiki;

import com.gitlab.rmarzec.base.BasePage;
import com.gitlab.rmarzec.framework.utils.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class WikiMainPage extends BasePage {

    public WikiMainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#p-lang .interlanguage-link-target")
    private List<WebElement> countries;
    @FindBy(css = "a[lang='en']")
    private WebElement englishWikiUrl;



    public void shouldGetAllCountries() {
        wait.until(ExpectedConditions.visibilityOfAllElements(countries));
        String enUrl = englishWikiUrl.getAttribute("href");
        for (WebElement element : countries) {
            if (element.getText().equals("English")) {
                System.out.println(element.getText() + " - URL: " + enUrl);
            } else {
                System.out.println(element.getText());
            }
        }
    }

}
