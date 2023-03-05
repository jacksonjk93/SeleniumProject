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
import org.junit.Assert;

/**
 *
 * @author jackson
 */
public class Login {

    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    public Login() {
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
    }

    @Test
    public void login() {
        // Test name: login
        // Step # | name | target | value
        // 1 | open | https://www.videoindexer.ai/account/login | 
        driver.get("https://www.videoindexer.ai/account/login");
        // 2 | setWindowSize | 1367x827 | 
        driver.manage().window().setSize(new Dimension(1367, 827));
        // 3 | click | Google button | 
        driver.findElement(By.id("viLoginGoogle")).click();
        // 4 | type | Enter email | jacksonncc@gmail.com
        driver.findElement(By.id("identifierId")).sendKeys("jackson.boey.21@gmail.com");
        // 5 | type | Click next button | jacksonncc@gmail.com
        driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
        try {
            Thread.sleep(20000);
        } catch (Exception expn) {
// catching the exception  
            System.out.println(expn);
        }
        // 6 | type | Enter password | @Jackson123
        driver.findElement(By.name("password")).sendKeys("@Jacksonjk123");
        // 7 | type | Click next button
        driver.findElement(By.cssSelector("#passwordNext > div > button")).click();
        // Verified Login Successfully
        String after_login_url = "https://www.videoindexer.ai/";
        String current_url = driver.getCurrentUrl();
        Assert.assertEquals(current_url, after_login_url);
    }

}
