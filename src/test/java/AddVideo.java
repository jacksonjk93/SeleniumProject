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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import java.util.*;
import org.junit.Assert;

/**
 *
 * @author jackson
 */
public class AddVideo {

    private WebDriver driver;
    // Add password here before running
    private String password = "";

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
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void addavideoWithDefaultSettingsNuploadbyfile() {
        // Test name: add_a_video
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

/////////////////////////////////////////////////////////////////////////////////////////////////////
        try {
            Thread.sleep(20000);
        } catch (Exception expn) {
// catching the exception  
            System.out.println(expn);
        }

        // Verify Login and load to main video indexer page
        String after_login_url = "https://www.videoindexer.ai/media/library";
        String current_url = driver.getCurrentUrl();

        Assert.assertEquals(current_url, after_login_url);
        
/////////////////////////////////////////////////////////////////////////////////////         
        String check_pop_up_appear;
        check_pop_up_appear = driver.findElement(By.id("mat-dialog-0")).getText();
        if (check_pop_up_appear != null){
          // click | Skip survey btn| 
        driver.findElement(By.id("cancelSurveyBtn")).click();  
        }
        
///////////////////////////////////////////////////////////////////////////////////// 

        // 1 | click upload button 
        driver.findElement(By.cssSelector("#galleryUpload > .i-vi-upload")).click();
        // 2 | type | Send File location for uploading | /Users/jackson/Downloads/WhatsApp Video 2023-03-04 at 7.54.24 AM.mp4
        driver.findElement(By.cssSelector(".ui-fileupload-choose > input")).sendKeys("/Users/jackson/Downloads/WhatsApp Video 2023-03-04 at 7.54.24 AM.mp4");
        // 3 | Click checkbox before upload
        driver.findElement(By.cssSelector(".checkbox-text")).click();

        // 4 | click upload | 
        driver.findElement(By.id("uploadButtonAction")).click();

        // 5 | assert check video name same as uploaded video name | 
        Assert.assertEquals("WhatsApp Video 2023-03-04 at 7.54.24 AM.mp4", driver.findElement(By.cssSelector(".progress-video-name")).getText() + ".mp4");

        String check_Percentage_Started;
        // 6 | assert check upload percentage display exist 
        check_Percentage_Started = driver.findElement(By.cssSelector(".percentage")).getText();
        Assert.assertNotNull("Null Percentage , Havent Start Indexing", check_Percentage_Started);

    }

    @Test
    public void addavideoWithDefaultSettingsNuploadbypath() {

        // Test name: add_a_video
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

/////////////////////////////////////////////////////////////////////////////////////////////////////
        try {
            Thread.sleep(20000);
        } catch (Exception expn) {
// catching the exception  
            System.out.println(expn);
        }

        // Verify Login and load to main video indexer page
        String after_login_url = "https://www.videoindexer.ai/media/library";
        String current_url = driver.getCurrentUrl();

        Assert.assertEquals(current_url, after_login_url);
        
/////////////////////////////////////////////////////////////////////////////////////         
        String check_pop_up_appear;
        check_pop_up_appear = driver.findElement(By.id("mat-dialog-0")).getText();
        if (check_pop_up_appear != null){
          // click | Skip survey btn| 
        driver.findElement(By.id("cancelSurveyBtn")).click();  
        }
        
///////////////////////////////////////////////////////////////////////////////////// 
        
        
        // 1 | click upload button on main page 
        driver.findElement(By.cssSelector("#galleryUpload > .i-vi-upload")).click();

        // 1 | click Enter a file url button 
        driver.findElement(By.cssSelector(".hide-on-drag:nth-child(5) .ng-star-inserted")).click();

        // 2 | Input File URL
        driver.findElement(By.id("urlInputId")).sendKeys("/Users/jackson/Downloads/WhatsApp Video 2023-03-04 at 7.54.24 AM.mp4");

        // 3 | Click checkbox before upload
        driver.findElement(By.cssSelector(".checkbox-text")).click();

        // 4 | assert check video name same as uploaded video name | 
        WebElement videoNameTextBox = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
        Assert.assertEquals("WhatsApp Video 2023-03-04 at 7.54.24 AM.mp4", videoNameTextBox.getAttribute("value") + ".mp4");

    }

    @Test
    public void addavideo_checkforadvancebuttonexist() {

        // Test name: add_a_video
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

/////////////////////////////////////////////////////////////////////////////////////////////////////
        try {
            Thread.sleep(20000);
        } catch (Exception expn) {
// catching the exception  
            System.out.println(expn);
        }

        // Verify Login and load to main video indexer page
        String after_login_url = "https://www.videoindexer.ai/media/library";
        String current_url = driver.getCurrentUrl();
        
/////////////////////////////////////////////////////////////////////////////////////         
        String check_pop_up_appear;
        check_pop_up_appear = driver.findElement(By.id("mat-dialog-0")).getText();
        if (check_pop_up_appear != null){
        // click | Skip survey btn| 
        driver.findElement(By.id("cancelSurveyBtn")).click();  
        }
        
///////////////////////////////////////////////////////////////////////////////////// 


        Assert.assertEquals(current_url, after_login_url);
        // 1 | click upload button on main page 
        driver.findElement(By.cssSelector("#galleryUpload > .i-vi-upload")).click();

        // 2 | click Enter a file url button 
        driver.findElement(By.cssSelector(".hide-on-drag:nth-child(5) .ng-star-inserted")).click();

        // 3 | Check if advance button is available to user
        if (!driver.findElement(By.cssSelector("#advanced > span")).isDisplayed()) {
            Assert.fail();
        }

    }

    @Test
    public void addavideo_able2changeprivacysetting() {

        // Test name: add_a_video
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

/////////////////////////////////////////////////////////////////////////////////////////////////////
        try {
            Thread.sleep(20000);
        } catch (Exception expn) {
// catching the exception  
            System.out.println(expn);
        }

        // Verify Login and load to main video indexer page
        String after_login_url = "https://www.videoindexer.ai/media/library";
        String current_url = driver.getCurrentUrl();

        Assert.assertEquals(current_url, after_login_url);

/////////////////////////////////////////////////////////////////////////////////////         
        String check_pop_up_appear;
        check_pop_up_appear = driver.findElement(By.id("mat-dialog-0")).getText();
        if (check_pop_up_appear != null){
        // click | Skip survey btn| 
        driver.findElement(By.id("cancelSurveyBtn")).click();  
        }
        
/////////////////////////////////////////////////////////////////////////////////////         

        // 1 | click upload button on main page 
        driver.findElement(By.cssSelector("#galleryUpload > .i-vi-upload")).click();

        // 2 | click Enter a file url button 
        driver.findElement(By.cssSelector(".hide-on-drag:nth-child(5) .ng-star-inserted")).click();

        // 3 | Click for Privacy dropdownlist to expand
        driver.findElement(By.xpath("//div[@id='indexing-privacy']/p-dropdown/div/div[2]/span/span")).click();
        // 4 | Change Privacy to Public from Default Private
        driver.findElement(By.xpath("//div[@id='indexing-privacy']/p-dropdown/div/div[4]/div/ul/p-dropdownitem[2]/li/div")).click();

        Assert.assertEquals("Public", driver.findElement(By.xpath("//div[2]/app-vi-fluent-action-menu/div/p-dropdown/div/div[2]/span/span")).getText());

    }

    @Test
    public void addavideo_able2changelanguagesetting() {

        // Test name: add_a_video
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

/////////////////////////////////////////////////////////////////////////////////////////////////////
        try {
            Thread.sleep(20000);
        } catch (Exception expn) {
// catching the exception  
            System.out.println(expn);
        }

        // Verify Login and load to main video indexer page
        String after_login_url = "https://www.videoindexer.ai/media/library";
        String current_url = driver.getCurrentUrl();

        Assert.assertEquals(current_url, after_login_url);
        
/////////////////////////////////////////////////////////////////////////////////////         
        String check_pop_up_appear;
        check_pop_up_appear = driver.findElement(By.id("mat-dialog-0")).getText();
        if (check_pop_up_appear != null){
         // click | Skip survey btn| 
        driver.findElement(By.id("cancelSurveyBtn")).click();  
        }
        
/////////////////////////////////////////////////////////////////////////////////////         
        
        // 1 | click upload button on main page 
        driver.findElement(By.cssSelector("#galleryUpload > .i-vi-upload")).click();

        // 2 | click Enter a file url button 
        driver.findElement(By.cssSelector(".hide-on-drag:nth-child(5) .ng-star-inserted")).click();

        // 3 | Change Video source language to Chinese (Simplified) from Default English
        driver.findElement(By.xpath("//div[@id='indexing-language']/p-dropdown/div/div[2]/span/span")).click();
        driver.findElement(By.xpath(".//span[contains(.,'Chinese (Simplified)')]")).click();

        Assert.assertEquals("Chinese (Simplified)", driver.findElement(By.xpath("//div[@id='indexing-language']/p-dropdown/div/div[2]/span/span")).getText());

    }

}
