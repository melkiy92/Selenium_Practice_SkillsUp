import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

    public class TestPageFactory {

        public TestPageFactory(WebDriver driver) {
            org.openqa.selenium.support.PageFactory.initElements(driver, this);
            this.driver = driver;
        }

        private String site = "http://skillsup.ua/about/our-team/";

        public WebDriver driver;

        @FindBy(linkText = "Ольга Симчак\n            \n            \n              тренер, PSPO, PSM")
        private WebElement simchak;

        @FindBy(linkText = "Анастасия Педоренко\n            \n            \n              тренер, PSPO")
        private WebElement pedorenko;

        @FindBy(linkText = "Виктория Писаренко\n            \n            \n              тренер, PSM, ISTQB CTFL")
        private WebElement pisarenko;

        @FindBy(xpath = "//div[@class='text']//a[.='Погружение в Scrum']")
        private WebElement scrum;

        @FindBy(className = "member")
        private WebElement member;

        @FindBy(className = "name")
        private WebElement memberName;

        @FindBy(className = "position")
        private WebElement memberPosition;

/*    public List<WebElement> getMembers() {
        return driver.findElements(member);
    }
    public String getMemberName(WebElement member) {
        return member.findElement(memberName).getText();;
    }
    public String getMemberPosition(WebElement member) {
        return member.findElement(memberPosition).getText();
    }

    public ArrayList<Person> getCards(String site) {
        driver.get(site);
        List<WebElement> members = getMembers();
        System.out.println(members.size());
        ArrayList <Person> persons = new ArrayList();

        for (WebElement member: members) {
            String name = member.findElement(memberName).getText();
            String position = member.findElement(memberPosition).getText();
            Person person = new Person(name, position);
            System.out.println(person.toString());
            persons.add(person);
        }
        return persons;
    }

    private String getPosition (String tutorName) {
        String foundPosition = null;
        ArrayList <Person> cards = getCards(site);
        for(Person person:cards){
            if(person.name.equals(tutorName)) {
                foundPosition = person.position;
                System.out.println(person.name + " has position: " + person.position);
                break;
            }
        }
        if( foundPosition.equals(null) ) throw new NoSuchElementException(tutorName + " was not found on the page.");
        return foundPosition;
    }*/

    };
