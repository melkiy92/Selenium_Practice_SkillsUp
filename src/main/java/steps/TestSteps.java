package steps;
import domain.Person;
import driver.DriverConfig;
import org.jbehave.core.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import page.ActionPage;
import page.TutorPage;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestSteps extends BaseSteps {

    @Given("open our team page")
    public void openOurTeamPage() {
        TutorPage tutorPage = new TutorPage(wd);
        tutorPage.openOurTeamPage();
    }

    @When("page contains tutors")
    public void tutorsFound() {
        TutorPage tutorPage = new TutorPage(wd);
        ArrayList <Person> tutors = new ArrayList();
        tutors = tutorPage.getCards();
        assertTrue(! tutors.isEmpty());
    }

    @Then("verify that position for $tutorName is $expectedPosition")
    public void verifyPosition(String tutorName, String expectedPosition) {
        TutorPage tutorPage = new TutorPage(wd);
        String actualResult = tutorPage.getPosition(tutorName);
        assertEquals(expectedPosition, actualResult);
    }

    @Given("open main page")
    public void  openMainPage() {
        ActionPage actionPage = new ActionPage(wd);
        actionPage.openMainPage();
    }

    @When("navigate training -> courses -> divingIntoJava")
    public void openDivingIntoJavaPage() throws InterruptedException {
        ActionPage actionPage = new ActionPage(wd);
        actionPage.getDivingIntoJavaPage();
        WebElement title = wd.findElement(By.className("greenHeader"));
        assertEquals("Diving into Java (Погружение в Java)",title.getText());
    }

    @Then("tutor $tutorName is shown on the page")
    public void verifyTutor(String tutorName) {
        ActionPage actionPage = new ActionPage(wd);
        assertTrue(actionPage.findTutor(tutorName));
    }



}
