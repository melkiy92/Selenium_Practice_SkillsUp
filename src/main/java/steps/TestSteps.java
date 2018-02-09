package steps;

import domain.Person;
import driver.DriverConfig;
import org.jbehave.core.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import page.TutorPage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestSteps extends BaseSteps {

    @Given("open $page")
    public void openPage(String page) throws InterruptedException {
        TutorPage tutorPage = new TutorPage(wd);
        tutorPage.openPage(page);
    }

    @When("page contains tutors")
    public void tutorsFound() {
        WebElement tutor = wd.findElement(By.partialLinkText());
        System.out.println(tutor.getText());
        assertTrue(tutor.isDisplayed());
    }

    @Then("verify that position for $tutorName is $expectedPosition")
    public void verifyPosition(String tutorName, String expectedPosition) {
        TutorPage tutorPage = new TutorPage(wd);
        String actualResult = tutorPage.getPosition(tutorName);
        assertEquals(expectedPosition, actualResult);
    }

}
