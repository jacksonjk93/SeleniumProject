import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
/**
 *
 * @author Michael Cropper
 */
public class NewJUnitTest {
 
    public NewJUnitTest() {
    }
 
    @BeforeClass
    public static void setUpClass() {
    }
 
    @AfterClass
    public static void tearDownClass() {
    }
 
    private WebDriver driver;
     
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
    }
 
    @After
    public void tearDown() {
        driver.quit();
    }
 
    @Test
    public void searchforapackageandviewpackageinformation() {
        // Test name: Search for a package and view package information
        // Step # | name | target | value
        // 1 | open | / | 
        driver.get("https://yum-info.contradodigital.com/");
        // 2 | setWindowSize | 1920x1040 | 
        driver.manage().window().setSize(new Dimension(1920, 1040));
        // 3 | click | id=YumSearch | 
        driver.findElement(By.id("YumSearch")).click();
        // 4 | type | id=YumSearch | sftp
        driver.findElement(By.id("YumSearch")).sendKeys("sftp");
        // 5 | sendKeys | id=YumSearch | ${KEY_ENTER}
        driver.findElement(By.id("YumSearch")).sendKeys(Keys.ENTER);
        // 6 | click | linkText=filezilla | 
        driver.findElement(By.linkText("filezilla")).click();
    }
}