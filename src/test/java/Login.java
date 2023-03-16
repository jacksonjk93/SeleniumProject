/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.lang.Thread;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.junit.Assert;

/**
 *
 * @author jackson
 */
public class Login {
    private WebDriver driver;
    // Add password here before running
    private String password = "";
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
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void login() {
        // Test name: login
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
        // 6 | type | Enter password
        driver.findElement(By.name("password")).sendKeys(password);
        // 7 | type | Click next button
        driver.findElement(By.cssSelector("#passwordNext > div > button")).click();
        try {
            Thread.sleep(20000);
        } catch (Exception expn) {
// catching the exception  
            System.out.println(expn);
        }
        // Verified Login Successfully
        String after_login_url = "https://www.videoindexer.ai/media/library";
        String current_url = driver.getCurrentUrl();
        Assert.assertEquals(current_url, after_login_url);
    }

}
