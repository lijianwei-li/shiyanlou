package com.li.day3;

import com.sun.xml.internal.ws.server.DefaultResourceInjector;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JSTest {
    WebDriver driver;

    @BeforeMethod
    public void openChrome(){
        ChromeOptions option = new ChromeOptions();
        option.setBinary("D:\\Google\\Chrome\\Application/chrome.exe");
        System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
        driver = new ChromeDriver(option);
    }
    @Test
    public void exJS() throws InterruptedException {
        driver.get("https://www.baidu.com/");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeAsyncScript("document.getElementById(\"kw\").setAttribute(\"value\",\"webdriver\")");
        //Thread.sleep(3000);
    }

    @AfterMethod
    public void closed(){
        driver.quit();
    }
}
