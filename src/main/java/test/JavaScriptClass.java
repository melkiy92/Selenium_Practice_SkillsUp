package test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import page.BasePage;
import page.TutorPage;
import test.BaseTest;

import static org.junit.Assert.assertEquals;

public class JavaScriptClass extends BaseTest {

    @Test
    public void verifyJSHome() throws InterruptedException {
        TutorPage tutorPage = new TutorPage(wd);
        tutorPage.openOurTeamPage();
        tutorPage.waitForElement(By.className("member"), 10);
    }

    @Test
    public void verifyJS() throws InterruptedException {
        BasePage basePage = new BasePage(wd);
        basePage.executeJavaScript("alert(confirm('Question?'));");
        Thread.sleep(5000L);
        Alert alert = wd.switchTo().alert();
        String textOnAlert = alert.getText();
        assertEquals("Question?", textOnAlert);
        alert.accept();
        Thread.sleep(5000L);
        wd.switchTo().alert().accept();
        boolean f;
        try {
            wd.switchTo().alert();
            f = true;
        } catch (NoAlertPresentException e) {
            f = false;
        }
        Assert.assertTrue(!f);
    }

    @Test
    public void getMemberViaJS() {
        wd.get("http://skillsup.ua/about/our-team/");
        JavascriptExecutor js = (JavascriptExecutor) wd;
        WebElement member = (WebElement) js.executeScript("return document.getElementsByClassName('member')[0];");
        System.out.println(member.getText());
    }
}

