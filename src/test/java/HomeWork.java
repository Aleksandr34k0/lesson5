import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Text;

import java.nio.channels.Selector;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class HomeWork {
    @BeforeAll
    static void before(){
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1580x800";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void homeWork(){
        Selenide.open("https://github.com/");


             $("header").$$("li").findBy(text("Solutions")).hover()
              .$$("li").findBy(text("Enterprise")).click();
$("#hero-section-brand-heading").shouldHave(text("The AI-powered\n"+"developer platform."));


    }
}
