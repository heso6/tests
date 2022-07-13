package com.gitlab.rmarzec.task;

import com.gitlab.rmarzec.framework.utils.DriverFactory;
import com.gitlab.rmarzec.pages.wiki.WikiMainPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class Task2Test {


    @Test
    public void Task2Test() {
        DriverFactory driverFactory = new DriverFactory();
        WebDriver webDriver = driverFactory.initDriver();
        WikiMainPage wikiMainPage = new WikiMainPage(webDriver);
        webDriver.get("https://pl.wikipedia.org/wiki/Wiki");

        wikiMainPage.shouldGetAllCountries();

    }


}
