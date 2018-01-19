import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected static WebDriver wd;
    /*protected WebDriver getDriver(){
        return wd;
    }*/

    @Before
    public void setUp() throws Exception {
        System.setProperty(DriverConfig.config.get("name"), DriverConfig.config.get("path") );
        wd = new FirefoxDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        wd.quit();
    }

    public boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

}
