package com.shippio.shippiotest;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

// https://www.jetbrains.com/
public class MainPage {
    public SelenideElement seeAllToolsButton = $x("//div[contains(@class, '_main_1e63mqc_17 _modeRock_1e63mqc_208 _sizeM_1e63mqc_99 _alignIconLeft_1e63mqc_77 _dark_1e63mqc_62 wt-col-inline wt-offset-top-12') and text() = 'See all tools']");
    public SelenideElement toolsMenu = $x("//div[contains(@class, '_mainMenuItem__action_dadqff_7') and text() = 'Developer Tools']");
//    public SelenideElement searchButton = $("[data-test='menu-main-icon-search']");
public SelenideElement searchButton = $x("/html/body/div/div[1]/div[3]/header/div/div/div[2]/div[1]/div/div/div/div[1]/button");
//    public SelenideElement developerToolsMenu = $x("//div[contains(@class, 'menu-main__item') and text() = 'Developer Tools']");

}
