package com.gitlab.rmarzec.pages.w3Schools;

import com.gitlab.rmarzec.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class W3SchoolsTryItYourselfPage extends BasePage {

    public W3SchoolsTryItYourselfPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "tryitLeaderboard")
    private WebElement leaderBoard;
    @FindBy(css = "body > h1")
    private WebElement title;

    @FindBy(css = "#cars")
    private WebElement chooseCar;


    public void shouldGetTitleFromPage() {
        switchToTheNewOpenedTab();
        wait.until(ExpectedConditions.visibilityOf(leaderBoard));
        driver.switchTo().frame("iframeResult");
        System.out.println("\nThe downloaded text is: " + title.getText());
    }

    public void shouldChooseCar(String carName) {
        Select selectCar = new Select(chooseCar);
        selectCar.selectByVisibleText(carName);
        String elementValue = chooseCar.getAttribute("value");

        System.out.println("(" + carName + ", " + elementValue + ")");

    }


}
