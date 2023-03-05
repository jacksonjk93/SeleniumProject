/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 *
 * @author jackson
 */
public class ViewVideoInsight {

    private WebDriver driver;
    private String password = "@Jacksonjk123";

    public ViewVideoInsight() {
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
    public void viewvideoinsight_abletomuteplay() {
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
 //////////////////////////////////////////////////////////////////////////////////////////////////////////
         try {
            Thread.sleep(20000);
        } catch (Exception expn) {
// catching the exception  
            System.out.println(expn);
        }
        // 1 | click | First thumbnail | 
        driver.findElement(By.cssSelector(".item-wrapper")).click();
        try {
            Thread.sleep(50000);
        } catch (Exception expn) {
// catching the exception  
            System.out.println(expn);
        }
        // 2 | click Mute button | 
        {
            WebElement element = driver.findElement(By.cssSelector(".vjs-mute-control"));
            Actions builder = new Actions(driver);
            builder.click(element).perform();
        }
        // 3 | click Play button | 
        driver.findElement(By.cssSelector(".vjs-play-control")).click();
    }
}
