import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import javax.lang.model.element.Element;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.actions;

public class DragAndDrop {

    @BeforeAll
    static void before(){
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1580x800";
        Configuration.holdBrowserOpen = true;
    }


    @Test
    void action(){

        open("https://the-internet.herokuapp.com/drag_and_drop");

SelenideElement elementA = $(By.id("column-a"));
SelenideElement elementB = $(By.id("column-b"));

        actions().dragAndDrop(elementA, elementB).perform();

        elementA.shouldHave(Condition.text("B"));
        elementB.shouldHave(Condition.text("A"));

        sleep(5000);

       elementA.dragAndDropTo(elementB);
        elementA.shouldHave(Condition.text("A"));
        elementB.shouldHave(Condition.text("B"));
    }
}





