package steps;

import driver.DriverConfig;
import org.jbehave.core.annotations.AfterStory;
import org.jbehave.core.annotations.BeforeStory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.util.concurrent.TimeUnit;

public class BaseSteps {

    protected static WebDriver wd;

    @BeforeStory
    public void driverStart() throws Exception {
        System.setProperty(DriverConfig.config.get("name"), DriverConfig.config.get("path") );
       // final FirefoxProfile firefoxProfile = new FirefoxProfile();
       // FirefoxOptions options = new FirefoxOptions();
       // options.addPreference("xpinstall.signatures.required", false);
        wd = new FirefoxDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    }

    @AfterStory
    public void driverStop() {
        wd.quit();
    }
}
