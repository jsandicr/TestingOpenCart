package com.testing.testcases;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBase {

    String url = "https://localhost/OpenCart/";
    WebDriver driver=null;
    
    @Before
    public void launchBrowser() throws InterruptedException{
        String browser="chrome";
        if(browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
            //Permitir paginas sin ssl
            DesiredCapabilities ssl = new DesiredCapabilities();    
            ssl.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
            ssl.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
            driver = new ChromeDriver(ssl);
        }else if(browser.equals("edge")){
            System.setProperty("webdriver.edge.driver", "C:\\msedgedriver.exe");
            driver = new EdgeDriver();
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(url);
    }
    
    @After
    public void teardown(){
        driver.quit();
    }
    
}
