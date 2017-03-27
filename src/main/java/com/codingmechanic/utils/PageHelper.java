package com.codingmechanic.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by masihur on 3/26/17.
 */
public class PageHelper {

    private WebDriver driver;

    public PageHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void enterText(WebElement element, String text){
        element.clear();
        element.sendKeys();
    }

    public void clickButton(WebElement element){
        element.click();
    }
}
