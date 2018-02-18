package test;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import page.ActionPage;
import page.BasePage;
import page.TutorPage;
import test.BaseTest;

import static org.junit.Assert.assertTrue;

public class ActionTest extends BaseTest {
    @Test
    public void selectTest() throws InterruptedException {
        wd.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
        wd.switchTo().frame("iframeResult");
        WebElement foundElement = wd.findElement(By.xpath("html/body/select"));
        Select select = new Select(foundElement);
        //select.selectByValue("opel");
        select.selectByIndex(3);
        Thread.sleep(5000L);
    }

    @Test
    public void actionTest() throws InterruptedException{
        Actions builder = new Actions(wd);
        wd.get("http://getbootstrap.com/docs/3.3/components/#btn-dropdowns-single");
        WebElement dropdown = wd.findElement(By.xpath("html/body/div[2]/div/div[1]/div[4]/div[2]/div[1]/button"));
        WebElement element = wd.findElement(By.xpath("html/body/div[2]/div/div[1]/div[4]/div[2]/div[1]/ul/li[2]/a"));
        builder.moveToElement(dropdown).click().moveToElement(element).clickAndHold().build().perform();
        Thread.sleep(5000L);
    }

    @Test
    public void getOurTeamPage() throws InterruptedException {
        ActionPage actionPage = new ActionPage(wd);
        actionPage.openMainPage();
        actionPage.getOurTeamPage();
        System.out.println(wd.getTitle());
    }

    @Test
    public void getDivingIntoJavaPage() throws InterruptedException {
        ActionPage actionPage = new ActionPage(wd);
        actionPage.openMainPage();
        actionPage.getDivingIntoJavaPage();
        assertTrue(actionPage.findTutor("Оксана Синяева"));
    }
}

