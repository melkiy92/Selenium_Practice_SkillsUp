package page;

import domain.Person;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.BasePage;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ActionPage extends BasePage {
    public ActionPage(WebDriver wd) {
        super(wd);
    }
    private By memberName = By.className("name");

    private List<WebElement> getMemberNames() {
        return wd.findElements(memberName);
    }

    public Boolean findTutor (String tutorName) {
        List<WebElement> members = getMemberNames();
        int count = 0;
        for (WebElement member: members) {
            if( member.getText().equals(tutorName) ) {
                count++;
            }
        }
        if( count == 1 ) {
            return true;
        } else {
            return false;
        }
     }

    public void getOurTeamPage() throws InterruptedException{
        Actions builder = new Actions(wd);
        WebElement dropdown = wd.findElement(By.xpath(".//*[@id='menu3039']/a"));
        WebElement element = wd.findElement(By.xpath(".//*[@id='menu3039']/ul/li[1]/a"));
        builder.moveToElement(dropdown).perform();
        builder.moveToElement(element).click().perform();
        Thread.sleep(5000L);
    }

    public void getDivingIntoJavaPage() throws InterruptedException{
        Actions builder = new Actions(wd);
        WebElement training = wd.findElement(By.xpath(".//*[@id='menu1078']/a"));
        WebElement courses = wd.findElement(By.xpath(".//*[@id='menu1078']/ul/li[1]/a"));
        WebElement divingIntoJava = wd.findElement(By.xpath(".//*[@id='subMenuSubNodes1189']/li[8]/a"));
        builder.moveToElement(training).perform();
        builder.moveToElement(courses).perform();
        builder.moveToElement(divingIntoJava).click().perform();
        Thread.sleep(5000L);
    }

}
