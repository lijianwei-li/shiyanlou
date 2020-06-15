package com.li.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionsTest {
    WebDriver driver;

    @BeforeMethod
    public void openChrome(){
//        ChromeOptions option = new ChromeOptions();
//        option.setBinary("D:\\Google\\Chrome\\Application/chrome.exe");
//        System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
//        driver = new ChromeDriver(option);
          System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
          driver = new ChromeDriver();
    }
    /**
     * 点击百度首页的新闻按钮
     */
    @Test
    public void clickTest(){
        driver.get("https://www.baidu.com");
        driver.findElement(By.linkText("新闻")).click();
    }

    @AfterMethod
    public void closed(){
        driver.quit();
    }

}
