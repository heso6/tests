package com.gitlab.rmarzec.task;

import com.gitlab.rmarzec.framework.utils.DriverFactory;
import com.gitlab.rmarzec.pages.w3Schools.W3SchoolsTryItYourselfPage;
import com.gitlab.rmarzec.pages.w3Schools.W3SchoolsMainPage;
import com.gitlab.rmarzec.pages.google.GoogleMainPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Task3Test {

    @Test
    public void Task3Test() {

        String textToSetInSearchField = "HTML select tag - W3Schools";
        String w3SchoolPageUrl = "https://www.w3schools.com/tags/tag_select.asp";
        String carName = "Opel";

        DriverFactory driverFactory = new DriverFactory();
        WebDriver webDriver = driverFactory.initDriver();
        GoogleMainPage googleMainPage = new GoogleMainPage(webDriver);
        W3SchoolsMainPage w3SchoolsMainPage = new W3SchoolsMainPage(webDriver);
        W3SchoolsTryItYourselfPage w3SchoolsTryItYourselfPage = new W3SchoolsTryItYourselfPage(webDriver);
        webDriver.get("https://www.google.com/");

        googleMainPage.shouldClickAcceptAllCookiesButton();
        googleMainPage.shouldSetTextToTheSearchField(textToSetInSearchField);
        googleMainPage.shouldClickLuckyShotButtonAndVerifyPageUrl(w3SchoolPageUrl);

        w3SchoolsMainPage.shouldClickAcceptAllCookies();
        w3SchoolsMainPage.shouldClickFirstTryItYourselfButton();
        w3SchoolsTryItYourselfPage.shouldGetTitleFromPage();
        w3SchoolsTryItYourselfPage.shouldChooseCar(carName);
    }

}
