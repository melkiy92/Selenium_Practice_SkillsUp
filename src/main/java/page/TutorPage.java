package page;

import domain.Person;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class TutorPage extends BasePage {

        public TutorPage(WebDriver wd) {
            super(wd);
        }

        private By member = By.className("member");
        private By memberName = By.className("name");
        private By memberPosition = By.className("position");

        private List<WebElement> getMembers() {
            return wd.findElements(member);
        }
        private String getMemberName(WebElement member) {
            return member.findElement(memberName).getText();
        }
        private String getMemberPosition(WebElement member) {
            return member.findElement(memberPosition).getText();
        }

        public ArrayList<Person> getCards() {

            List<WebElement> members = getMembers();
            ArrayList <Person> persons = new ArrayList();

            for (WebElement member: members) {
                String name = getMemberName(member);
                String position = getMemberPosition(member);
                Person person = new Person(name, position);
                persons.add(person);
            }
            return persons;
        }

        public String getPosition (String tutorName) {
            String foundPosition = null;
            ArrayList <Person> cards = getCards();
            for(Person person:cards){
                if(person.name.equals(tutorName)) {
                    foundPosition = person.position;
                    //System.out.println(person.name + " имеет позицию: " + person.position);
                    break;
                }
            }
            if( foundPosition.equals(null) ) throw new NoSuchElementException(tutorName + " was not found on the page.");
            return foundPosition;
        }

    }


