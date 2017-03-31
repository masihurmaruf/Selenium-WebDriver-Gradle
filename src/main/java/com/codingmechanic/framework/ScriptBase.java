package com.codingmechanic.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * Created by masihur on 3/26/17.
 */
public class ScriptBase {

    protected WebDriver driver;
    protected ApplicationBase application;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.phantomjs.driver", "phantomjs");
        driver = new PhantomJSDriver();
        driver.navigate().to("http://www.google.com");
        application = ApplicationBase.getInstance(driver);
    }

    @AfterTest
    public void tearDown(){
        driver.close();
    }
}
