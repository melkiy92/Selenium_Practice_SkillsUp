import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage {

    public BasePage(WebDriver wd ) {
        this.wd = wd;
    }
    protected WebDriver wd;

    JavascriptExecutor js = (JavascriptExecutor) wd;

    protected void executeJavaScript(String jsCode) {
        js.executeScript(jsCode);
    }

    protected void waitForElement(By locator, int time) {
        WebDriverWait wait = new WebDriverWait(wd, time);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }
}
