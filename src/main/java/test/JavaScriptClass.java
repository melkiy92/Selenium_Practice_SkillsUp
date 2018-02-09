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
        //basePage.executeJavaScript("alert(confirm('Question?'));");
        BasePage basePage = new BasePage(wd);
        TutorPage tutorPage = new TutorPage(wd);
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
        } catch (NoAlertPresentException e ) {
            f = false;
        }
        Assert.assertTrue(!f);
        }

        //js.executeScript("alert('Hello world');");
       /*wd.get("http://skillsup.ua/about/our-team/");

        //TODO move to the Base Page into method(locator, time): to wait for element on any page
        //TODO wait on presence o Alert

        WebDriverWait wait = new WebDriverWait(wd, 10);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("member")));

        WebElement simchak =  wd.findElement(By.linkText("Ольга Симчак\n            \n            \n              тренер, PSPO, PSM"));
        //WebElement member = (WebElement) js.executeScript("return document.getElementsByClassName('member')[0];");
        String name = simchak.findElement(By.className("name")).getText();
        System.out.println(name);
        //Thread.sleep(5000L); */
    }

