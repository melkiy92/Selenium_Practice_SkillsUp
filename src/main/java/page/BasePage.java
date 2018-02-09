package page;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class BasePage {

    public BasePage(WebDriver wd) {
        this.wd = wd;
    }

    protected WebDriver wd;

    public void executeJavaScript(String jsCode) {
        JavascriptExecutor js = (JavascriptExecutor) wd;
        js.executeScript(jsCode);
    }

    public void waitForElement(By locator, int time) {
        WebDriverWait wait = new WebDriverWait(wd, time);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }

    public void waitForAlert(int time) {
        WebDriverWait wait = new WebDriverWait(wd, time);
        wait.until(ExpectedConditions.alertIsPresent());
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