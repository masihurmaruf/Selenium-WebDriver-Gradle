package com.codingmechanic.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by masihur on 3/26/17.
 */
public class ScriptBase {

    protected WebDriver driver;
    protected ApplicationBase application;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.phantomjs.driver", "phantomjs");
        driver = new PhantomJSDriver();
        driver.navigate().to("http://www.google.com");
        application = ApplicationBase.getInstance(driver);
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
