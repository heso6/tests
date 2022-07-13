package com.gitlab.rmarzec.task;

import com.gitlab.rmarzec.framework.utils.DriverFactory;
import com.gitlab.rmarzec.model.YTTile;
import com.gitlab.rmarzec.pages.youTube.YouTubeMainPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


public class Task4Test {


    @Test
    public void Task4Test() {
        DriverFactory driverFactory = new DriverFactory();
        WebDriver webDriver = driverFactory.initDriver();
        YouTubeMainPage youTubeMainPage = new YouTubeMainPage(webDriver);
        webDriver.get("https://www.youtube.com/");

        youTubeMainPage.shouldClickAcceptAllCookiesButton();
        youTubeMainPage.shouldAddElementsToTheList();

//        Lista kafelkow
        List<YTTile> ytTileList = new ArrayList<YTTile>();




    }
}
