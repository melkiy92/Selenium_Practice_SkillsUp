import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class TutorTest extends BaseTest {
    //Why doesn't work?
    //TutorPage tutorPage = new TutorPage(wd);

    String errorMessagePosition = "Position doesn't match";
    @Test
    public void verifyPositionYakovenko() {
        TutorPage tutorPage = new TutorPage(wd);
        String expectedResult = "тренер, автор курса";
        String actualResult = tutorPage.getPosition("Павел Яковенко");
        assertEquals(errorMessagePosition, expectedResult, actualResult);
    }
    @Test
    public void verifyPositionMelnik() {
        TutorPage tutorPage = new TutorPage(wd);
        String expectedResult = "преподаватель английского";
        String actualResult = tutorPage.getPosition("Дарья Мельник");
        assertEquals(errorMessagePosition, expectedResult, actualResult);
    }
    @Test
    public void verifyPositionSimchak() {
        TutorPage tutorPage = new TutorPage(wd);
        String expectedResult = "тренер, PSPO, PSM";
        String actualResult = tutorPage.getPosition("Ольга Симчак");
        assertEquals(errorMessagePosition, expectedResult, actualResult);
    }

    }
