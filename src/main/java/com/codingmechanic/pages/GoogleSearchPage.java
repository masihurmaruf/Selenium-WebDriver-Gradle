package com.codingmechanic.pages;

import com.codingmechanic.utils.PageHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocator;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

/**
 * Created by masihur on 3/26/17.
 */
public class GoogleSearchPage {

    private PageHelper help;

    public GoogleSearchPage(WebDriver driver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);
        help = new PageHelper(driver);
    }

    @FindBy(how = How.NAME, using = "q")
    private WebElement searchBox;

    @FindBy(how = How.NAME, using = "btnG")
    private WebElement searchButton;

    public void serchText(String text){
        help.enterText(searchBox, text);
    }

    public void clickSearch(){
        help.clickButton(searchButton);
    }




}
