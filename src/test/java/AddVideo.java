/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.lang.Thread;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author jackson
 */
public class AddVideo {

    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    public AddVideo() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/jackson/NetBeansProjects/SeleniumProject/driver/chromedriver");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
    }

    @After
    public void tearDown() {
//        driver.quit();
    }

    @Test
    public void addavideo() {

        // Test name: add_a_video
        // Step # | name | target | value
        // 1 | open | https://www.videoindexer.ai/account/login | 
        driver.get("https://www.videoindexer.ai/account/login");
        // 2 | setWindowSize | 1367x827 | 
        driver.manage().window().setSize(new Dimension(1367, 827));
        // 3 | click | id=viLoginGoogle | 
        driver.findElement(By.id("viLoginGoogle")).click();
//        // 4 | type | id=identifierId | jackson.boey.21@gmail.com
        driver.findElement(By.id("identifierId")).sendKeys("jackson.boey.21@gmail.com");
        // 5 | type | id=identifierId | jacksonncc@gmail.com
        driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
        try {
            Thread.sleep(20000);
        } catch (Exception expn) {
// catching the exception  
            System.out.println(expn);
        }
        driver.findElement(By.name("password")).sendKeys("@Jackson123");
        driver.findElement(By.cssSelector("#passwordNext > div > button")).click();


        try {
            Thread.sleep(20000);
        } catch (Exception expn) {
// catching the exception  
            System.out.println(expn);
        }

        // 3 | click upload button when user first time uploading video | css=#galleryUploadEmptyState > .ng-star-inserted:nth-child(2) | 
        driver.findElement(By.cssSelector("#galleryUploadEmptyState > .ng-star-inserted:nth-child(2)")).click();

        // 3 | click upload button when user has uploaded video before \ | css=#galleryUpload > .i-vi-upload | 
//        driver.findElement(By.cssSelector("#galleryUpload > .i-vi-upload")).click();
        // 4 | type | css=.ui-fileupload-choose > input | /Users/jackson/Downloads/WhatsApp Video 2023-03-04 at 7.54.24 AM.mp4
        driver.findElement(By.cssSelector(".ui-fileupload-choose > input")).sendKeys("/Users/jackson/Downloads/WhatsApp Video 2023-03-04 at 7.54.24 AM.mp4");
        // 5 | mouseOver | css=#uploadButtonAction > .ng-star-inserted | 
        {
            WebElement element = driver.findElement(By.cssSelector("#uploadButtonAction > .ng-star-inserted"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).click();
        }
    }

}
