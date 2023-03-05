/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author jackson
 */
public class BaseTest {
    public BaseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

     @Test
           public void baseTest() {
       Login logintc= new Login ();
       AddVideo addvideotc= new AddVideo ();
       ViewVideoInsight viewVideoInsightTC= new ViewVideoInsight ();
       // Login Test Case
       logintc.setUp();
       logintc.login();
       logintc.tearDown();
       // Check if Able To View video insights N Use Play N Mute button
       viewVideoInsightTC.setUp();
       viewVideoInsightTC.viewvideoinsight_abletomuteplay();
       viewVideoInsightTC.tearDown();
       // Add A Video Related Test Cases
       // Check if Advance Button Exist
       addvideotc.setUp();
       addvideotc.addavideo_checkforadvancebuttonexist();
       addvideotc.tearDown();
       // Check if Can Upload File By Drag N Drop
       addvideotc.setUp();
       addvideotc.addavideoWithDefaultSettingsNuploadbyfile();
       addvideotc.tearDown();
        // Check if Can Upload File By Path
       addvideotc.setUp();
       addvideotc.addavideoWithDefaultSettingsNuploadbypath();
       addvideotc.tearDown();
       // Check if Able To Change Video Source Language
       addvideotc.setUp();
       addvideotc.addavideo_able2changelanguagesetting();
       addvideotc.tearDown();
       // Check if Able To Change Video Source Privacy
       addvideotc.setUp();
       addvideotc.addavideo_able2changeprivacysetting();
       addvideotc.tearDown();
      
   
     
     }
}
