package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.BaseTest;

import java.util.*;
import static org.junit.Assert.*;

public class NavigateMenu extends BaseTest {
    private By trainingLocator = By.xpath(".//*[@id='menu1078']/a");
    private By consultingLocator = By.xpath(".//*[@id='menu1076']/a");
    private By projectsLocator = By.xpath(".//*[@id='menu6600']/a");
    private By careerLocator = By.xpath(".//*[@id='menu1219']/a");
    private By outOfOfficeLocator = By.xpath(".//*[@id='menu1143']/a");
    private By calendarLocator = By.xpath(".//*[@id='menu3020']/a");
    private By aboutLocator = By.xpath(".//*[@id='menu3039']/a");
    private By contactsLocator = By.xpath(".//*[@id='menu1106']/a");
    private By wrongLocator = By.xpath(".//*[@id='menu11069999']/a");
    private String site = "http://skillsup.ua/";

     @Test
     public void testNavigateMenu() {
         wd.get(site);
         WebElement menu1 = wd.findElement(trainingLocator);
         System.out.println(menu1.getText());
         WebElement menu2 = wd.findElement(consultingLocator);
         System.out.println(menu2.getText());
         WebElement menu3 = wd.findElement(projectsLocator);
         System.out.println(menu3.getText());
         WebElement menu4 = wd.findElement(careerLocator);
         System.out.println(menu4.getText());
         WebElement menu5 = wd.findElement(outOfOfficeLocator);
         System.out.println(menu5.getText());
         WebElement menu6 = wd.findElement(calendarLocator);
         System.out.println(menu6.getText());
         WebElement menu7 = wd.findElement(aboutLocator);
         System.out.println(menu7.getText());
         WebElement menu8 = wd.findElement(contactsLocator);
         System.out.println(menu8.getText());
         List expectedResult = List.of("Обучение","Консалтинг", "RunIT",  "Карьера", "Вне офиса", "Календарь", "О нас", "Контакты");
         List actualResult = List.of(menu1.getText(), menu2.getText(), menu3.getText(), menu4.getText(), menu5.getText(), menu6.getText(), menu7.getText(), menu8.getText());
         assertTrue(menu1.isDisplayed());
         assertEquals("Verification failed", expectedResult, actualResult);
     }

     @Test
     public void testElementNotPresent() {
         wd.get(site);
         List<WebElement> locators = wd.findElements(wrongLocator);
         assertTrue(locators.isEmpty());
     };
}

