package com.codingmechanic.framework;

import com.codingmechanic.pages.GoogleSearchPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by masihur on 3/26/17.
 */
public class ApplicationBase {

    private WebDriver driver;
    private GoogleSearchPage page;

    private ApplicationBase(WebDriver driver) {
        this.driver = driver;
    }

    private static ApplicationBase instance;

    // Single instance of Application, thread safe
    public static synchronized ApplicationBase getInstance(WebDriver driver){
        if(instance == null){
            instance = new ApplicationBase(driver);
        }
        return instance;
    }
    public GoogleSearchPage getPage(){
        if(page == null){
            page = new GoogleSearchPage(driver);
        }
        return page;
    }
}
